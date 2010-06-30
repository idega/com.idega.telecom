package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.telecom.services.bean.Phone;

public class UnlockCodes extends TelecomBlock {

	@Override
	public void present(FacesContext context) {
		Phone phone = getTelecomServices().getPhone("");
		
		String PIN = phone.getPin1();
		String PUK = phone.getPuk1();
	}

}