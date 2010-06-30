package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.presentation.IWContext;

public class BuyCredit extends TelecomBlock {

	private static final String PARAMETER_PHONE_NUMBER = "prm_phone_number";
	private static final String PARAMETER_CREDIT_CARD_NUMBER = "prm_credit_card_number";
	private static final String PARAMETER_MONTH = "prm_month";
	private static final String PARAMETER_YEAR = "prm_year";
	private static final String PARAMETER_AMOUNT = "prm_amount";
	
	@Override
	public void present(FacesContext context) {
	}

	private void save(IWContext iwc) {
		String phoneNumber = iwc.getParameter(PARAMETER_PHONE_NUMBER);
		String creditCardNumber = iwc.getParameter(PARAMETER_CREDIT_CARD_NUMBER);
		String month = iwc.getParameter(PARAMETER_MONTH);
		String year = iwc.getParameter(PARAMETER_YEAR);
		String amount = iwc.getParameter(PARAMETER_AMOUNT);
		
		getTelecomServices().buyCredit(phoneNumber, creditCardNumber, month, year, amount);
	}
}