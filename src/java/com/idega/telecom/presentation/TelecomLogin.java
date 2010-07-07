package com.idega.telecom.presentation;

import java.util.List;

import javax.faces.context.FacesContext;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.presentation.IWContext;
import com.idega.telecom.services.bean.Phone;
import com.idega.telecom.services.bean.User;
import com.idega.util.PresentationUtil;

public class TelecomLogin extends TelecomBlock {

	private static final String PARAMETER_LOGIN = "prm_login";
	private static final String PARAMETER_LOGOUT = "prm_logout";
	private static final String PARAMETER_USERNAME = "prm_username";
	private static final String PARAMETER_PASSWORD = "prm_password";
	
	@Override
	protected void present(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		
		boolean failed = false;
		User user = null;
		if (iwc.isParameterSet(PARAMETER_LOGIN)) {
			String userName = iwc.getParameter(PARAMETER_USERNAME);
			String password = iwc.getParameter(PARAMETER_PASSWORD);
			
			user = getTelecomServices().getUserByUserNameAndPassword(userName, password);
			if (user != null) {
				getTelecomSession().setUser(user);
				
				Phone phone = getPhone();
				getTelecomSession().setPhone(phone);
				
				iwc.sendRedirect("/pages/mittgsm/");
			}
			else {
				failed = true;
			}
		}
		else if (iwc.isParameterSet(PARAMETER_LOGOUT)) {
			getTelecomSession().setUser(null);
			iwc.sendRedirect("/pages");
		}
		else {
			user = getTelecomSession().getUser();			
		}

		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getJQuery().getBundleURIToJQueryLib());
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getBundle().getVirtualPathWithFileNameString("javascript/login.js"));

		if (user != null) {
			FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
			facelet.setFaceletURI(getBundle().getFaceletURI("login/loggedIn.xhtml"));
			add(facelet);
		}
		else if (failed) {
			FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
			facelet.setFaceletURI(getBundle().getFaceletURI("login/loginFailed.xhtml"));
			add(facelet);
		}
		else {
			FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
			facelet.setFaceletURI(getBundle().getFaceletURI("login/loggedOut.xhtml"));
			add(facelet);
		}
	}

	private Phone getPhone() {
		User user = getTelecomSession().getUser();
		if (user != null) {
			List<Phone> phones = user.getGsmPhones();
			if (!phones.isEmpty()) {
				Phone phone = phones.iterator().next();
				return getTelecomServices().getPhone(phone.getNumber());
			}
		}
		
		return null;
	}
}