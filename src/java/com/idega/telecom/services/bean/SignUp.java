package com.idega.telecom.services.bean;

public class SignUp {

	private Phone phone;
	
	private User user;
	private User owner;
	
	//	starting amount, if ordering a goldnumber for example
	private String signupAmount;
	
	//	if true then number contains the old number
	private boolean importNumber;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getSignupAmount() {
		return signupAmount;
	}

	public void setSignupAmount(String signupAmount) {
		this.signupAmount = signupAmount;
	}

	public boolean isImportNumber() {
		return importNumber;
	}

	public void setImportNumber(boolean importNumber) {
		this.importNumber = importNumber;
	}

}
