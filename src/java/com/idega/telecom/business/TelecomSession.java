package com.idega.telecom.business;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.telecom.webservice.client.User;

@Scope("session")
@Service("telecomSession")
public class TelecomSession {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}	
}