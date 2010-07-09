package com.idega.telecom.services.business;

import java.util.List;
import java.util.Map;

import com.idega.telecom.services.bean.AvailablePhone;
import com.idega.telecom.services.bean.FriendNumber;
import com.idega.telecom.services.bean.Phone;
import com.idega.telecom.services.bean.SignUp;
import com.idega.telecom.services.bean.UsageEntry;
import com.idega.telecom.services.bean.User;

public interface TelecomServices {

	/**
	 * Buys credit
	 * @return “success” string if successful otherwise return errorCode
	 */
	public String buyCredit(String phoneNumber, String creditCardNumber, String month, String year, String amount);
	
	/**
	 * Finds user
	 * @param userName
	 * @param password
	 * @return
	 */
	public User getUserByUserNameAndPassword(String userName, String password);
	
	/**
	 * This method should equally update users and owners
	 * @param user
	 * @return “success” if successfully updated user info if error occurred return error code or explanation
	 */
	public String updateUser(User user);
	
	/**
	 * Updates login
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return Success message or error code
	 */
	public String updateUserLogin(String userName, String oldPassword, String newPassword);
	
	/**
	 * Updates phone
	 * @param phone
	 * @return Success message or error code
	 */
	public String updatePhone(Phone phone);
	
	/**
	 * Registers "friend phone"
	 * @param friendNumbers
	 * @return The same list with error messages if any.
	 */
	public List<FriendNumber> registerFriendPhone(List<FriendNumber> friendNumbers);
	
	/**
	 * This method will be used very few times to fully synchronize our user systems and to create test data
	 * @return
	 */
	public List<User> getAllUsers();
	
	/**
	 * Gets users registered on or after the given date, for statistical information and synchronizing
	 * @param fromDate
	 * @return
	 */
	public List<User> getUsers(String fromDate);
	
	/**
	 * Gets a single user (owner or regular user)
	 * @param personalId
	 * @return
	 */
	public User getUserByPersonalId(String personalId);
	
	/**
	 * Gets a single user (regular user)
	 * @param number
	 * @return
	 */
	public User getUserByNumber(String number);
	
	/**
	 * Gets phones registered to a user (not the owner unless they are the same)
	 * @param personalId
	 * @return
	 */
	public List<Phone> getPhonesForUser(String personalId);
	
	/**
	 * Gets phones registered to an owner
	 * @param personalId
	 * @return
	 */
	public List<Phone> getPhonesForOwner(String personalId);

	/**
	 * Gets phone by number
	 * @param number
	 * @return
	 */
	public Phone getPhone(String number);
	
	/**
	 * Gets all entries for all phones registered to this user
	 * @param personalId
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public Map<String, List<UsageEntry>> getUsageEntriesByPersonalId(String personalId, String fromDate, String toDate);
	
	/**
	 * Gets all entries for this phone number
	 * @param number
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public Map<String, List<UsageEntry>> getUsageEntriesByNumber(String number, String fromDate, String toDate);
	
	/**
	 * Gets all entries of the specified type for all phones of the specified user (by personalId)
	 * @param personalId
	 * @param fromDate
	 * @param toDate
	 * @param type
	 * @return
	 */
	public List<UsageEntry> getUsageEntriesByPersonalIdAndType(String personalId, String fromDate, String toDate, String type);
	
	/**
	 * Gets all entries of the specified type for all phones of the specified number
	 * @param number
	 * @param fromDate
	 * @param toDate
	 * @param type
	 * @return
	 */
	public List<UsageEntry> getUsageEntriesByNumberAndType(String number, String fromDate, String toDate, String type);
	
	/**
	 * Gets friend numbers
	 * @param number
	 * @param personalId
	 * @return
	 */
	public List<FriendNumber> getFriendNumbers(String number, String personalId);
	
	/**
	 * Gets number of used friend call minutes
	 * @param month (1 - 12)
	 * @return
	 */
	public String getNumberOfUsedFriendCallMinutes(int month);
	
	/**
	 * Gets number of used friend SMS
	 * @param month (1 - 12)
	 * @return
	 */
	public String getNumberOfUsedFriendSMS(int month);
	
	/**
	 * Returns false if that is not the owner of the number, otherwise - true
	 * @param personalId
	 * @param number
	 * @return
	 */
	public boolean verifyPhoneNumberOwner(String personalId, String number);
	
	/**
	 * Returns true if the right code is entered
	 * @param personalId
	 * @param number
	 * @param smscode
	 * @return
	 */
	public boolean verifySMSCode(String personalId, String number, String smscode);
	
	/**
	 * "seedNumber" is of the format XXXXXXX e.g. 615XXXX should return "returnCount" many AvailablePhone objects with numbers beginning with “615”.
	 * The boolean "onlyReturnGoldNumbers" should explain itself
	 * @param seedNumber
	 * @param onlyReturnGoldNumbers
	 * @param returnCount
	 * @return
	 */
	public List<AvailablePhone> getAvailablePhoneNumbers(String seedNumber, boolean onlyReturnGoldNumbers, String returnCount);
	
	/**
	 * Returns "success:TheOrderNumber" or errorCode
	 * @param registration
	 * @return
	 */
	public String registerNewPhone(SignUp registration);
}
