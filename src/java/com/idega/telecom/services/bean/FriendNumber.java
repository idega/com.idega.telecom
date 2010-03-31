package com.idega.telecom.services.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class FriendNumber implements Serializable {

	private static final long serialVersionUID = -6159187850697530008L;
	
	private String friendNumber;
	private String name;
	private String connectedNumber;
	private String errorMessage;
	
	private Timestamp lastChangedTimestamp;

	public String getFriendNumber() {
		return friendNumber;
	}

	public void setFriendNumber(String friendNumber) {
		this.friendNumber = friendNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConnectedNumber() {
		return connectedNumber;
	}

	public void setConnectedNumber(String connectedNumber) {
		this.connectedNumber = connectedNumber;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Timestamp getLastChangedTimestamp() {
		return lastChangedTimestamp;
	}

	public void setLastChangedTimestamp(Timestamp lastChangedTimestamp) {
		this.lastChangedTimestamp = lastChangedTimestamp;
	}
	
}
