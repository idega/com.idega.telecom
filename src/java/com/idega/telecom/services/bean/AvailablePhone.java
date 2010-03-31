package com.idega.telecom.services.bean;

import java.io.Serializable;

public class AvailablePhone implements Serializable {

	private static final long serialVersionUID = 4946406425903725069L;

	private String number;
	
	private boolean goldNumber;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isGoldNumber() {
		return goldNumber;
	}

	public void setGoldNumber(boolean goldNumber) {
		this.goldNumber = goldNumber;
	}
	
}
