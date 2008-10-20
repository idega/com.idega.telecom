package com.idega.telecom.services.bean;

import java.util.List;

import com.idega.util.IWTimestamp;

public class Phone {

	private String number;
	private String ownerPersonalId;
	private String userPersonalId;
	private String billReceiverPersonalId;
	private String pin1;
	private String puk1;
	private String balance;
	
	//	prepaid, postpaid
	private String serviceType;
	
	//	creditcard, invoice, internetbank
	private String paymentType;
	private String creditCardNumber;
	private String creditCardExpiryMonth;
	private String creditCardExpiryYear;
	private String creditCardCVC;
	private String autoRefillAmount;
	
	private List<FriendNumber> friendNumbers;
	
	private boolean foreignNumberLockEnabled;
	private boolean serviceNumberLockEnabled;
	private boolean autoRefill;
	private boolean goldNumber;
	
	private IWTimestamp startDate;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOwnerPersonalId() {
		return ownerPersonalId;
	}

	public void setOwnerPersonalId(String ownerPersonalId) {
		this.ownerPersonalId = ownerPersonalId;
	}

	public String getUserPersonalId() {
		return userPersonalId;
	}

	public void setUserPersonalId(String userPersonalId) {
		this.userPersonalId = userPersonalId;
	}

	public String getBillReceiverPersonalId() {
		return billReceiverPersonalId;
	}

	public void setBillReceiverPersonalId(String billReceiverPersonalId) {
		this.billReceiverPersonalId = billReceiverPersonalId;
	}

	public String getPin1() {
		return pin1;
	}

	public void setPin1(String pin1) {
		this.pin1 = pin1;
	}

	public String getPuk1() {
		return puk1;
	}

	public void setPuk1(String puk1) {
		this.puk1 = puk1;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardExpiryMonth() {
		return creditCardExpiryMonth;
	}

	public void setCreditCardExpiryMonth(String creditCardExpiryMonth) {
		this.creditCardExpiryMonth = creditCardExpiryMonth;
	}

	public String getCreditCardExpiryYear() {
		return creditCardExpiryYear;
	}

	public void setCreditCardExpiryYear(String creditCardExpiryYear) {
		this.creditCardExpiryYear = creditCardExpiryYear;
	}

	public String getCreditCardCVC() {
		return creditCardCVC;
	}

	public void setCreditCardCVC(String creditCardCVC) {
		this.creditCardCVC = creditCardCVC;
	}

	public String getAutoRefillAmount() {
		return autoRefillAmount;
	}

	public void setAutoRefillAmount(String autoRefillAmount) {
		this.autoRefillAmount = autoRefillAmount;
	}

	public List<FriendNumber> getFriendNumbers() {
		return friendNumbers;
	}

	public void setFriendNumbers(List<FriendNumber> friendNumbers) {
		this.friendNumbers = friendNumbers;
	}

	public boolean isForeignNumberLockEnabled() {
		return foreignNumberLockEnabled;
	}

	public void setForeignNumberLockEnabled(boolean foreignNumberLockEnabled) {
		this.foreignNumberLockEnabled = foreignNumberLockEnabled;
	}

	public boolean isServiceNumberLockEnabled() {
		return serviceNumberLockEnabled;
	}

	public void setServiceNumberLockEnabled(boolean serviceNumberLockEnabled) {
		this.serviceNumberLockEnabled = serviceNumberLockEnabled;
	}

	public boolean isAutoRefill() {
		return autoRefill;
	}

	public void setAutoRefill(boolean autoRefill) {
		this.autoRefill = autoRefill;
	}

	public boolean isGoldNumber() {
		return goldNumber;
	}

	public void setGoldNumber(boolean goldNumber) {
		this.goldNumber = goldNumber;
	}

	public IWTimestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(IWTimestamp startDate) {
		this.startDate = startDate;
	}
}
