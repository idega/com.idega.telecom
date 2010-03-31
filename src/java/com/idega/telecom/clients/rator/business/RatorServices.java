package com.idega.telecom.clients.rator.business;

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

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service(TelecomConstants.RATOR_SERVICES_SPRING_BEAN_IDENTIFIER)
public class RatorServices implements TelecomServices {
	
	public String buyCredit(String phoneNumber, String creditCardNumber,
			String month, String year, String amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AvailablePhone> getAvailablePhoneNumbers(String seedNumber,
			boolean onlyReturnGoldNumbers, String returnCount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FriendNumber> getFriendNumbers(String number, String personalId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumberOfUsedFriendCallMinutes(int month) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumberOfUsedFriendSMS(int month) {
		// TODO Auto-generated method stub
		return null;
	}

	public Phone getPhone(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Phone> getPhonesForOwner(String personalId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Phone> getPhonesForUser(String personalId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UsageEntry> getUsageEntriesByNumber(String number,
			String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UsageEntry> getUsageEntriesByNumberAndType(String number,
			String fromDate, String toDate, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UsageEntry> getUsageEntriesByPersonalId(String personalId,
			String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UsageEntry> getUsageEntriesByPersonalIdAndType(
			String personalId, String fromDate, String toDate, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByPersonalId(String personalId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsers(String fromDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FriendNumber> registerFriendPhone(
			List<FriendNumber> friendNumbers) {
		// TODO Auto-generated method stub
		return null;
	}

	public String registerNewPhone(SignUp registration) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updatePhone(Phone phone) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateUserLogin(String userName, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verifyPhoneNumberOwner(String personalId, String number) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifySMSCode(String personalId, String number,
			String smscode) {
		// TODO Auto-generated method stub
		return false;
	}

}
