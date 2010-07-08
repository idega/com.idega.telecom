package com.idega.telecom.webservice.client;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

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
			//String endpoint = "http://localhost:8080/CDRatorTemp/WebServiceCDRator.asmx";

			WebServiceCDRatorLocator locator = new WebServiceCDRatorLocator();
			WebServiceCDRatorSoap_PortType port = locator.getWebServiceCDRatorSoap();
			//WebServiceCDRatorSoap_PortType port = locator.getWebServiceCDRatorSoap(new URL(endpoint));
			//((org.apache.axis.client.Stub) port).setTimeout(2000);
			
			User user = port.userGetByNumberAndPassword("8671374", "uaga22");//userGetByNumber("8671374");
			if (user == null) {
				System.out.println("user is null");
			}
			
			Phone phone = port.phoneGetByNumber("8671374");
			//System.out.println(Float.toString(phone.getBalance()));
			//System.out.println(phone.getStartDate());
			
			SimpleDateFormat sdfDestination = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
			IWTimestamp stamp = new IWTimestamp(sdfDestination.parse(phone.getStartDate()));
			
			//System.out.println("stamp = " + stamp.toString());
			
			
			/*FriendNumber numbers[] = port.friendsGetByNumber("8671374");
			for (int i = 0; i < numbers.length; i++) {
				System.out.println("friend " + i + " = " +numbers[i].getNumber() + " " + numbers[i].getEndDate());
			}*/
			//System.out.println("" + user.getGsmPhone());
			//System.out.println(port.testHelloWorld());
			
			IWTimestamp today = new IWTimestamp();
			IWTimestamp from = new IWTimestamp();
			from.addDays(-14);
			
			System.out.println("from = " + from.toString());
			System.out.println("to = " + today.toString());
			
			GregorianCalendar calFrom = new GregorianCalendar();
			calFrom.setTime(from.getDate());

			GregorianCalendar calTo = new GregorianCalendar();
			calTo.setTime(today.getDate());
			System.out.println(calTo.getTime().toString());
			
			System.out.println("1");
			UsageEntry entries[] = port.usageEntryGetByPersonalIdAndDate("0610703899", calFrom, calTo);//usageEntryGetByNumberAndDate("8671374", from.getCalendar(), today.getCalendar());
			System.out.println("2");
			if (entries != null && entries.length != 0) {
				System.out.println("3");
				for (int i = 0; i < entries.length; i++) {
					System.out.println(i);
					UsageEntry entry = entries[i];
					System.out.println(entry.getAmount());
					System.out.println(entry.getCountryOfOrigin());
					System.out.println(entry.getDescription());
					System.out.println(entry.getDuration());
					System.out.println(entry.getEntryType());
					System.out.println(entry.getNumber());
					System.out.println(entry.getOriginPhoneNumber());
					System.out.println(entry.getRecipientCountry());
					System.out.println(entry.getUsageDate());
				}
			}
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}