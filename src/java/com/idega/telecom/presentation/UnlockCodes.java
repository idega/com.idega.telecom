package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.presentation.IWContext;
import com.idega.telecom.services.bean.Phone;

public class UnlockCodes extends TelecomBlock {

	@Override
	protected void present(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		
		Phone phone = getTelecomSession().getPhone();
		if (phone != null) {
			view(iwc, phone);
		}
	}
	
	private void view(IWContext iwc, Phone phone) {
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(getBundle().getFaceletURI("unlockCodes/view.xhtml"));
		add(facelet);
	}
}