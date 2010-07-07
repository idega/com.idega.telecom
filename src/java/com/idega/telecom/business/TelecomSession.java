package com.idega.telecom.business;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.telecom.services.bean.Phone;
import com.idega.telecom.services.bean.User;

@Scope("session")
@Service("telecomSession")
public class TelecomSession {

	private User user;
	private Phone phone;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}	
}