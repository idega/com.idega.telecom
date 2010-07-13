package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.presentation.IWContext;
import com.idega.telecom.business.TelecomBean;
import com.idega.util.IWTimestamp;
import com.idega.util.PresentationUtil;

public class BuyCredit extends TelecomBlock {

	private static final String PARAMETER_CREDIT_CARD_NUMBER = "prm_credit_card_number";
	private static final String PARAMETER_MONTH = "prm_month";
	private static final String PARAMETER_YEAR = "prm_year";
	private static final String PARAMETER_SECURITY_NUMBER = "prm_cvc_number";
	private static final String PARAMETER_AMOUNT = "prm_amount";
	
	@Override
	protected void present(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		
		if (getTelecomSession().getUser() != null) {
			if (iwc.isParameterSet(PARAMETER_ACTION)) {
				save(iwc);
			}
			view(iwc);
		}
	}

	private void view(IWContext iwc) {
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getJQuery().getBundleURIToJQueryLib());
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getBundle().getVirtualPathWithFileNameString("javascript/buyCredit.js"));

		IWTimestamp stamp = new IWTimestamp();
		
		TelecomBean bean = getBeanInstance("telecomBean");
		bean.setStartYear(stamp.getYear());
		bean.setEndYear(stamp.getYear() + 10);

		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(getBundle().getFaceletURI("buyCredit/view.xhtml"));
		add(facelet);
	}
	
	private void save(IWContext iwc) {
		String[] creditCardNumbers = iwc.getParameterValues(PARAMETER_CREDIT_CARD_NUMBER);
		
		StringBuffer buffer = new StringBuffer();
		for (String string : creditCardNumbers) {
			buffer.append(string);
		}
		
		String securityNumber = iwc.getParameter(PARAMETER_SECURITY_NUMBER);
		if (securityNumber == null) {
			//bleh...
		}
		String month = iwc.getParameter(PARAMETER_MONTH);
		String year = iwc.getParameter(PARAMETER_YEAR);
		String amount = iwc.getParameter(PARAMETER_AMOUNT);
		
		getTelecomServices().buyCredit(getTelecomSession().getPhone().getNumber(), buffer.toString(), month, year, amount);
	}
}