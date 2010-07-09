package com.idega.telecom.services.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class UsageEntry implements Serializable {

	private static final long serialVersionUID = 6717537117151515820L;

	//	call,sms,data,credit
	private String invoiceLines;
	
	//	the gsm number for which this entry is for
	private String number;
	private String description;
	private String originPhoneNumber;
	private String recipientPhoneNumber;
	private String countryOfOrigin;
	private String recipientCountry;
	private float amount;
	private String duration;
	private String entryType;
	
	public String getEntryType() {
		return entryType;
	}

	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}

	//	empty if not a credit entry otherwise in form e.g. AA-07-... like todays pdf bill names
	private String billName;
	
	//	true if a local call,sms,data...
	private boolean local;
	
	private Timestamp usageDate;

	public String getInvoiceLines() {
		return invoiceLines;
	}

	public void setInvoiceLines(String invoiceLines) {
		this.invoiceLines = invoiceLines;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOriginPhoneNumber() {
		return originPhoneNumber;
	}

	public void setOriginPhoneNumber(String originPhoneNumber) {
		this.originPhoneNumber = originPhoneNumber;
	}

	public String getRecipientPhoneNumber() {
		return recipientPhoneNumber;
	}

	public void setRecipientPhoneNumber(String recipientPhoneNumber) {
		this.recipientPhoneNumber = recipientPhoneNumber;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getRecipientCountry() {
		return recipientCountry;
	}

	public void setRecipientCountry(String recipientCountry) {
		this.recipientCountry = recipientCountry;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public boolean isLocal() {
		return local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	public Timestamp getUsageDate() {
		return usageDate;
	}

	public void setUsageDate(Timestamp usageDate) {
		this.usageDate = usageDate;
	}
	
}
