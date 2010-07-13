package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;

public class ChangePassword extends TelecomBlock {
	
	private static final String PARAMETER_OLD_PASSWORD = "prm_old_password";
	private static final String PARAMETER_NEW_PASSWORD = "prm_new_password";

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
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getBundle().getVirtualPathWithFileNameString("javascript/changePassword.js"));

		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(getBundle().getFaceletURI("changePassword/view.xhtml"));
		add(facelet);
	}

	private void save(IWContext iwc) {
		String oldPassword = iwc.getParameter(PARAMETER_OLD_PASSWORD);
		String newPassword = iwc.getParameter(PARAMETER_NEW_PASSWORD);
		
		getTelecomServices().updateUserLogin(null, oldPassword, newPassword);
	}
}