package com.idega.telecom.services.bean;

import com.idega.util.IWTimestamp;

public class FriendNumber {

	private String friendNumber;
	private String name;
	private String connectedNumber;
	private String errorMessage;
	
	private IWTimestamp lastChangedTimestamp;

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

	public IWTimestamp getLastChangedTimestamp() {
		return lastChangedTimestamp;
	}

	public void setLastChangedTimestamp(IWTimestamp lastChangedTimestamp) {
		this.lastChangedTimestamp = lastChangedTimestamp;
	}
	
}
