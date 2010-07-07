package com.idega.telecom.clients.rator.business;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.telecom.TelecomConstants;
import com.idega.telecom.services.bean.AvailablePhone;
import com.idega.telecom.services.bean.FriendNumber;
import com.idega.telecom.services.bean.Phone;
import com.idega.telecom.services.bean.SignUp;
import com.idega.telecom.services.bean.UsageEntry;
import com.idega.telecom.services.bean.User;
import com.idega.telecom.services.business.TelecomServices;
import com.idega.telecom.webservice.client.WebServiceCDRatorLocator;
import com.idega.telecom.webservice.client.WebServiceCDRatorSoap_PortType;
import com.idega.util.IWTimestamp;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service(TelecomConstants.RATOR_SERVICES_SPRING_BEAN_IDENTIFIER)
public class RatorServices implements TelecomServices {

	public String buyCredit(String phoneNumber, String creditCardNumber,
			String month, String year, String amount) {

		return null;
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();

		try {
			com.idega.telecom.webservice.client.User wsUsers[] = getWSClient()
					.userGetAll();
			if (wsUsers != null && wsUsers.length != 0) {
				for (int i = 0; i < wsUsers.length; i++) {
					User user = convertWSUserToUser(wsUsers[i]);

					users.add(user);
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return users;
	}

	public List<AvailablePhone> getAvailablePhoneNumbers(String seedNumber,
			boolean onlyReturnGoldNumbers, String returnCount) {
		return null;
	}

	public List<FriendNumber> getFriendNumbers(String number, String personalId) {
		List<FriendNumber> friendNumbers = new ArrayList<FriendNumber>();

		try {
			com.idega.telecom.webservice.client.FriendNumber wsFriendNumbers[] = getWSClient()
					.friendsGetByNumber(number);
			if (wsFriendNumbers != null && wsFriendNumbers.length != 0) {
				for (int i = 0; i < wsFriendNumbers.length; i++) {
					FriendNumber friendNumber = convertWSFriendNumberToFriendNumber(
							number, wsFriendNumbers[i]);
					if (friendNumber != null) {
						friendNumbers.add(friendNumber);
					}
				}
			}
		} catch (RemoteException e) {
		}

		return friendNumbers;
	}

	public String getNumberOfUsedFriendCallMinutes(int month) {
		return null;
	}

	public String getNumberOfUsedFriendSMS(int month) {
		return null;
	}

	public Phone getPhone(String number) {
		Phone phone = null;
		try {
			com.idega.telecom.webservice.client.Phone wsPhone = getWSClient()
					.phoneGetByNumber(number);
			if (wsPhone != null) {
				phone = convertWSPhoneToPhone(wsPhone);
			}
		} catch (RemoteException e) {
		}

		return phone;
	}

	public List<Phone> getPhonesForOwner(String personalId) {
		return null;
	}

	public List<Phone> getPhonesForUser(String personalId) {
		return null;
	}

	public List<UsageEntry> getUsageEntriesByNumber(String number,
			String fromDate, String toDate) {
		List<UsageEntry> entries = new ArrayList<UsageEntry>();

		IWTimestamp from = new IWTimestamp(fromDate);
		IWTimestamp to = new IWTimestamp(toDate);
		try {
			com.idega.telecom.webservice.client.UsageEntry wsEntries[] = getWSClient()
					.usageEntryGetByNumberAndDate(number, from.getCalendar(),
							to.getCalendar());
			if (wsEntries != null && wsEntries.length != 0) {
				for (int i = 0; i < wsEntries.length; i++) {
					UsageEntry entry = convertWSUsageEntryToUsageEntry(wsEntries[i]);
					entries.add(entry);
				}
			}
		} catch (RemoteException e) {
		}

		return entries;
	}

	public List<UsageEntry> getUsageEntriesByNumberAndType(String number,
			String fromDate, String toDate, String type) {
		List<UsageEntry> entries = new ArrayList<UsageEntry>();

		IWTimestamp from = new IWTimestamp(fromDate);
		IWTimestamp to = new IWTimestamp(toDate);
		try {
			com.idega.telecom.webservice.client.UsageEntry wsEntries[] = getWSClient()
					.usageEntryGetByNumberAndDate(number, from.getCalendar(),
							to.getCalendar());
			if (wsEntries != null && wsEntries.length != 0) {
				for (int i = 0; i < wsEntries.length; i++) {
					UsageEntry entry = convertWSUsageEntryToUsageEntry(wsEntries[i]);
					if (type.equals(entry.getEntryType())) {
						entries.add(entry);
					}
				}
			}
		} catch (RemoteException e) {
		}

		return entries;
	}

	public List<UsageEntry> getUsageEntriesByPersonalId(String personalId,
			String fromDate, String toDate) {
		List<UsageEntry> entries = new ArrayList<UsageEntry>();

		IWTimestamp from = new IWTimestamp(fromDate);
		IWTimestamp to = new IWTimestamp(toDate);
		try {
			com.idega.telecom.webservice.client.UsageEntry wsEntries[] = getWSClient()
					.usageEntryGetByPersonalIdAndDate(personalId, from.getCalendar(),
							to.getCalendar());
			if (wsEntries != null && wsEntries.length != 0) {
				for (int i = 0; i < wsEntries.length; i++) {
					UsageEntry entry = convertWSUsageEntryToUsageEntry(wsEntries[i]);
					entries.add(entry);
				}
			}
		} catch (RemoteException e) {
		}

		return entries;
	}

	public List<UsageEntry> getUsageEntriesByPersonalIdAndType(
			String personalId, String fromDate, String toDate, String type) {
		List<UsageEntry> entries = new ArrayList<UsageEntry>();

		IWTimestamp from = new IWTimestamp(fromDate);
		IWTimestamp to = new IWTimestamp(toDate);
		try {
			com.idega.telecom.webservice.client.UsageEntry wsEntries[] = getWSClient()
					.usageEntryGetByPersonalIdAndDate(personalId, from.getCalendar(),
							to.getCalendar());
			if (wsEntries != null && wsEntries.length != 0) {
				for (int i = 0; i < wsEntries.length; i++) {
					UsageEntry entry = convertWSUsageEntryToUsageEntry(wsEntries[i]);
					if (type.equals(entry.getEntryType())) {
						entries.add(entry);
					}
				}
			}
		} catch (RemoteException e) {
		}

		return entries;
	}

	public User getUserByNumber(String number) {
		User user = null;
		try {
			com.idega.telecom.webservice.client.User wsUser = getWSClient().userGetByNumber(number);
			if (wsUser != null) {
				user = convertWSUserToUser(wsUser);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return user;
	}

	public User getUserByPersonalId(String personalId) {
		User user = null;
		try {
			com.idega.telecom.webservice.client.User wsUser = getWSClient().userFindByPersonalId(personalId);
			if (wsUser != null) {
				user = convertWSUserToUser(wsUser);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return user;
	}

	public User getUserByUserNameAndPassword(String userName, String password) {
		User user = null;
		try {
			com.idega.telecom.webservice.client.User wsUser = getWSClient()
					.userGetByNumberAndPassword(userName, password);
			if (wsUser != null) {
				user = convertWSUserToUser(wsUser);
			}
		} catch (RemoteException e) {
		}
		
		return user;
	}

	public List<User> getUsers(String fromDate) {
		return null;
	}

	public List<FriendNumber> registerFriendPhone(
			List<FriendNumber> friendNumbers) {
		return null;
	}

	public String registerNewPhone(SignUp registration) {
		return null;
	}

	public String updatePhone(Phone phone) {
		return null;
	}

	public String updateUser(User user) {
		return null;
	}

	public String updateUserLogin(String number, String oldPassword,
			String newPassword) {
		boolean updated = false;
		try {
			updated = getWSClient().userUpdatePassword(number, oldPassword, newPassword);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return Boolean.toString(updated);
	}

	public boolean verifyPhoneNumberOwner(String personalId, String number) {
		Phone phone = getPhone(number);
		if (phone != null) {
			if (phone.getOwnerPersonalId().equals(personalId)) {
				return true;
			}
		}
		
		return false;
	}

	public boolean verifySMSCode(String personalId, String number,
			String smscode) {
		return false;
	}

	private User convertWSUserToUser(
			com.idega.telecom.webservice.client.User wsUser) {
		User user = new User();
		user.setCity(wsUser.getCity());
		user.setCountry(wsUser.getCountry());
		user.setEmail(wsUser.getEmail());
		List<Phone> gsmPhones = new ArrayList<Phone>();
		Phone gsm = new Phone();
		gsm.setNumber(wsUser.getGsmPhone());
		gsmPhones.add(gsm);
		user.setGsmPhones(gsmPhones);
		user.setHomePhone(wsUser.getHomePhone());
		user.setName(wsUser.getName());
		user.setPersonalId(wsUser.getPersonalId());
		user.setStreetAndNumber(wsUser.getStreetAndNumber());
		user.setZip(wsUser.getZip());

		return user;
	}

	private FriendNumber convertWSFriendNumberToFriendNumber(
			String connectedNumber,
			com.idega.telecom.webservice.client.FriendNumber wsFriendNumber) {
		if (wsFriendNumber.getEndDate() != null && !"".equals(wsFriendNumber.getEndDate())) {
			return null;
		}
		
		FriendNumber number = new FriendNumber();

		number.setConnectedNumber(connectedNumber);
		number.setFriendNumber(wsFriendNumber.getNumber());
		IWTimestamp lt = new IWTimestamp(wsFriendNumber.getLastChangedDate());
		number.setLastChangedTimestamp(lt.getTimestamp());

		return number;
	}

	private Phone convertWSPhoneToPhone(
			com.idega.telecom.webservice.client.Phone wsPhone) {
		Phone phone = new Phone();
		phone.setAutoRefill(wsPhone.getAutoRefill() != null);
		phone.setAutoRefillAmount(wsPhone.getAutoRefillAmount());
		phone.setBalance(Float.toString(wsPhone.getBalance()));
		phone.setBillReceiverPersonalId(wsPhone.getBillReceiverPersonalID());
		phone.setCreditCardCVC(wsPhone.getCreditCardCVC());
		phone.setCreditCardExpiryMonth(wsPhone.getCreditCardExpiryMonth());
		phone.setCreditCardExpiryYear(wsPhone.getCreditCardExpiryYear());
		phone.setCreditCardNumber(wsPhone.getCreditCardNumber());
		phone.setForeignNumberLockEnabled(wsPhone.isForeignNumberLockEnabled());
		// phone.setFriendNumbers(friendNumbers);
		phone.setGoldNumber(wsPhone.isIsGoldNumber());
		phone.setNumber(wsPhone.getNumber());
		phone.setOwnerPersonalId(wsPhone.getOwnerPersonalID());
		if (wsPhone.isPaymentType()) {
			phone.setPaymentType("card");
		} else {
			phone.setPaymentType("bank");
		}
		phone.setPin1(wsPhone.getPin1());
		phone.setPuk1(wsPhone.getPuk1());
		phone.setServiceNumberLockEnabled(wsPhone
				.isForeignServiceNumberLockEnabled());
		phone.setServiceType(wsPhone.getServiceType());
		phone.setStartDate(new IWTimestamp(wsPhone.getStartDate())
				.getTimestamp());
		phone.setUserPersonalId(wsPhone.getUserPersonalID());

		return phone;
	}

	private UsageEntry convertWSUsageEntryToUsageEntry(com.idega.telecom.webservice.client.UsageEntry wsUsageEntry) {
		UsageEntry entry = new UsageEntry();
		entry.setAmount(Float.toString(wsUsageEntry.getAmount()));
		//entry.setBillName(wsUsageEntry.g);
		entry.setCountryOfOrigin(wsUsageEntry.getCountryOfOrigin());
		entry.setDescription(wsUsageEntry.getDescription());
		entry.setDuration(Float.toString(wsUsageEntry.getDuration()));
		entry.setEntryType(wsUsageEntry.getEntryType());
		//entry.setInvoiceLines(wsUsageEntry.get);
		//entry.setLocal(wsUsageEntry.get);
		entry.setNumber(wsUsageEntry.getNumber());
		entry.setOriginPhoneNumber(wsUsageEntry.getOriginPhoneNumber());
		entry.setRecipientCountry(wsUsageEntry.getRecipientCountry());
		//entry.setRecipientPhoneNumber(wsUsageEntry.get);
		entry.setUsageDate(new IWTimestamp(wsUsageEntry.getUsageDate()).getTimestamp());
		
		return entry;
	}

	
	private WebServiceCDRatorSoap_PortType getWSClient() {
		try {
			// String endpoint =
			// "http://vala.reykjavik.is/WSLeikskoli/WSLeikskoliSoapHttpPort";

			WebServiceCDRatorLocator locator = new WebServiceCDRatorLocator();
			WebServiceCDRatorSoap_PortType port = locator
					.getWebServiceCDRatorSoap();// getWSLeikskoliSoapHttpPort(new
												// URL(endpoint));
			// ((org.apache.axis.client.Stub) port).setTimeout(2000);

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}