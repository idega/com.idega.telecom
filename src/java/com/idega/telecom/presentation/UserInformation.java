package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.presentation.IWContext;
import com.idega.telecom.services.bean.User;
import com.idega.util.EmailValidator;
import com.idega.util.PresentationUtil;

public class UserInformation extends TelecomBlock {

	private static final String PARAMETER_NAME = "prm_name";
	private static final String PARAMETER_ADDRESS = "prm_address";
	private static final String PARAMETER_POSTAL_CODE = "prm_postal_code";
	private static final String PARAMETER_POSTAL_ADDRESS = "prm_postal_address";
	private static final String PARAMETER_HOME_PHONE = "prm_home_phone";
	private static final String PARAMETER_EMAIL = "prm_email";
	
	@Override
	protected void present(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		
		User user = getTelecomSession().getUser();
		if (user != null) {
			if (iwc.isParameterSet(PARAMETER_ACTION)) {
				save(iwc, user);
			}

			view(iwc);
		}
	}
	
	private void view(IWContext iwc) {
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getJQuery().getBundleURIToJQueryLib());
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getBundle().getVirtualPathWithFileNameString("javascript/userInformation.js"));

		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(getBundle().getFaceletURI("userInformation/view.xhtml"));
		add(facelet);
	}
	
	private void save(IWContext iwc, User user) {
		String name = iwc.getParameter(PARAMETER_NAME);
		String address = iwc.getParameter(PARAMETER_ADDRESS);
		String postalCode = iwc.getParameter(PARAMETER_POSTAL_CODE);
		String postalAddress = iwc.getParameter(PARAMETER_POSTAL_ADDRESS);
		String homePhone = iwc.getParameter(PARAMETER_HOME_PHONE);
		
		String[] emails = iwc.getParameterValues(PARAMETER_EMAIL);
		String email = null;
		if (emails.length == 2) {
			email = emails[0];
			String emailConfirm = emails[1];
			
			if (!email.equals(emailConfirm)) {
				//Handle error...
			}
			else if (EmailValidator.getInstance().validateEmail(email)) {
				//Handle error...
			}
		}
		
		user.setCity(postalAddress);
		user.setEmail(email);
		user.setHomePhone(homePhone);
		user.setName(name);
		user.setStreetAndNumber(address);
		user.setZip(postalCode);
		
		getTelecomServices().updateUser(user);
	}
}