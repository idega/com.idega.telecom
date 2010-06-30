package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.presentation.IWContext;

public class ChangePassword extends TelecomBlock {
	
	private static final String PARAMETER_USERNAME = "prm_username";
	private static final String PARAMETER_OLD_PASSWORD = "prm_old_password";
	private static final String PARAMETER_NEW_PASSWORD = "prm_new_password";

	@Override
	public void present(FacesContext context) {
	}

	private void save(IWContext iwc) {
		String userName = iwc.getParameter(PARAMETER_USERNAME);
		String oldPassword = iwc.getParameter(PARAMETER_OLD_PASSWORD);
		String newPassword = iwc.getParameter(PARAMETER_NEW_PASSWORD);
		
		getTelecomServices().updateUserLogin(userName, oldPassword, newPassword);
	}
}