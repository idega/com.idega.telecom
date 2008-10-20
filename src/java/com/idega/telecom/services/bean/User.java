package com.idega.telecom.services.bean;

import java.util.List;

public class User {

	private String name;
	private String personalId;
	private String email;
	private String streetAndNumber;
	private String zip;
	private String city;
	private String country;
	private String homePhone;
	
	private List<Phone> gsmPhones;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonalId() {
		return personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetAndNumber() {
		return streetAndNumber;
	}

	public void setStreetAndNumber(String streetAndNumber) {
		this.streetAndNumber = streetAndNumber;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public List<Phone> getGsmPhones() {
		return gsmPhones;
	}

	public void setGsmPhones(List<Phone> gsmPhones) {
		this.gsmPhones = gsmPhones;
	}
	
}
