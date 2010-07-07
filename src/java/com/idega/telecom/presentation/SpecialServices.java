package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.presentation.IWContext;
import com.idega.telecom.services.bean.Phone;
import com.idega.util.CoreConstants;
import com.idega.util.PresentationUtil;

public class SpecialServices extends TelecomBlock {

	public static final String PARAMETER_FOREIGN_NUMBER_LOCK = "prm_foreign_number_lock";
	public static final String PARAMETER_SERVICE_NUMBER_LOCK = "prm_service_number_lock";
	
	@Override
	protected void present(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		
		Phone phone = getTelecomSession().getPhone();
		if (phone != null) {
			view(iwc, phone);
		}
	}
	
	private void view(IWContext iwc, Phone phone) {
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getJQuery().getBundleURIToJQueryLib());
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, CoreConstants.DWR_ENGINE_SCRIPT);
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, CoreConstants.DWR_UTIL_SCRIPT);
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, "/dwr/interface/TelecomBusiness.js");
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getBundle().getVirtualPathWithFileNameString("javascript/specialServices.js"));

		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(getBundle().getFaceletURI("specialServices/view.xhtml"));
		add(facelet);
	}
}