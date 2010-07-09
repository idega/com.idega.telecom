package com.idega.telecom.webservice.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.idega.telecom.services.bean.UsageEntry;
import com.idega.util.IWTimestamp;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestClient client = new TestClient();
		client.doStuff();
	}

	private void doStuff() {
		try {
			// String endpoint =
			// "http://localhost:8080/CDRatorTemp/WebServiceCDRator.asmx";

			WebServiceCDRatorLocator locator = new WebServiceCDRatorLocator();
			WebServiceCDRatorSoap_PortType port = locator
					.getWebServiceCDRatorSoap();
			// WebServiceCDRatorSoap_PortType port =
			// locator.getWebServiceCDRatorSoap(new URL(endpoint));
			// ((org.apache.axis.client.Stub) port).setTimeout(2000);

			// User user = port.userGetByNumberAndPassword("8671374",
			// "uaga22");//userGetByNumber("8671374");
			// if (user == null) {
			// System.out.println("user is null");
			// }

			// Phone phone = port.phoneGetByNumber("8671374");
			// System.out.println(Float.toString(phone.getBalance()));
			// System.out.println(phone.getStartDate());

			// SimpleDateFormat sdfDestination = new
			// SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
			// IWTimestamp stamp = new
			// IWTimestamp(sdfDestination.parse(phone.getStartDate()));

			// System.out.println("stamp = " + stamp.toString());

			/*
			 * FriendNumber numbers[] = port.friendsGetByNumber("8671374"); for
			 * (int i = 0; i < numbers.length; i++) {
			 * System.out.println("friend " + i + " = " +numbers[i].getNumber()
			 * + " " + numbers[i].getEndDate()); }
			 */
			// System.out.println("" + user.getGsmPhone());
			// System.out.println(port.testHelloWorld());

			IWTimestamp today = new IWTimestamp();
			IWTimestamp from = new IWTimestamp();
			from.addDays(-1);

			System.out.println("from = " + from.toString());
			System.out.println("to = " + today.toString());

			com.idega.telecom.webservice.client.UsageEntry entries[] = port
					.usageEntryGetByNumberAndDate("8671374", from.getCalendar(),
							today.getCalendar());
			if (entries != null && entries.length != 0) {
				Map<UsageEntry, Map<UsageEntry, List<UsageEntry>>> map = createMapFromWSUsageEntries(entries);
				createTotalsForMap(map);
				Set<UsageEntry> key1 = map.keySet();
				for (UsageEntry e : key1) {
					System.out.println(e.getDuration());
					System.out.println(e.getEntryType());
					System.out.println(e.getAmount());
					System.out.println(e.getDescription());
					System.out.println("");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createTotalsForMap(
			Map<UsageEntry, Map<UsageEntry, List<UsageEntry>>> map) {
		Set<UsageEntry> key1 = map.keySet();
		for (UsageEntry e : key1) {
			float total = 0.0f;
			int count = 0;

			Map<UsageEntry, List<UsageEntry>> innerMap = map.get(e);
			if (innerMap != null) {
				Set<UsageEntry> key2 = innerMap.keySet();
				for (UsageEntry e2 : key2) {
					float innerTotal = 0.0f;
					int innerCount = 0;
					List<UsageEntry> entries = innerMap.get(e2);
					for (UsageEntry e3 : entries) {
						innerTotal += e3.getAmount();
						innerCount++;
						total += e3.getAmount();
						count++;
					}

					e2.setAmount(innerTotal);
					e2.setDuration(Integer.toString(innerCount));
					innerMap.put(e2, entries);
				}

				e.setAmount(total);
				e.setDuration(Integer.toString(count));
				map.put(e, innerMap);
			}
		}
	}

	private Map<UsageEntry, Map<UsageEntry, List<UsageEntry>>> createMapFromWSUsageEntries(
			com.idega.telecom.webservice.client.UsageEntry wsEntries[]) {
		Map<UsageEntry, Map<UsageEntry, List<UsageEntry>>> map = new HashMap<UsageEntry, Map<UsageEntry, List<UsageEntry>>>();

		for (int i = 0; i < wsEntries.length; i++) {
			UsageEntry entry = convertWSUsageEntryToUsageEntry(wsEntries[i]);
			UsageEntry keyEntry = new UsageEntry();
			keyEntry.setEntryType(entry.getEntryType());
			Map<UsageEntry, List<UsageEntry>> valueEntries = map.get(keyEntry);
			List<UsageEntry> usageEntries = null;
			if (valueEntries == null) {
				valueEntries = new HashMap<UsageEntry, List<UsageEntry>>();
				usageEntries = new ArrayList<UsageEntry>();
			} else {
				usageEntries = valueEntries.get(entry);
				if (usageEntries == null) {
					usageEntries = new ArrayList<UsageEntry>();
				}
			}
			usageEntries.add(entry);
			valueEntries.put(entry, usageEntries);

			map.put(keyEntry, valueEntries);
		}

		return map;
	}

	private UsageEntry convertWSUsageEntryToUsageEntry(
			com.idega.telecom.webservice.client.UsageEntry wsUsageEntry) {
		UsageEntry entry = new UsageEntry();
		entry.setAmount(wsUsageEntry.getAmount());
		// entry.setBillName(wsUsageEntry.g);
		entry.setCountryOfOrigin(wsUsageEntry.getCountryOfOrigin());
		entry.setDescription(wsUsageEntry.getDescription());
		entry.setDuration(Float.toString(wsUsageEntry.getDuration()));
		entry.setEntryType(wsUsageEntry.getEntryType());
		// entry.setInvoiceLines(wsUsageEntry.get);
		// entry.setLocal(wsUsageEntry.get);
		entry.setNumber(wsUsageEntry.getNumber());
		entry.setOriginPhoneNumber(wsUsageEntry.getOriginPhoneNumber());
		entry.setRecipientCountry(wsUsageEntry.getRecipientCountry());
		// entry.setRecipientPhoneNumber(wsUsageEntry.get);
		SimpleDateFormat sdfDestination = new SimpleDateFormat(
				"dd.MM.yyyy hh:mm:ss");
		try {
			entry.setUsageDate(new IWTimestamp(sdfDestination
					.parse(wsUsageEntry.getUsageDate())).getTimestamp());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return entry;
	}

}