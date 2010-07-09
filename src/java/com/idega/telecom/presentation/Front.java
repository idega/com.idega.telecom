package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;

public class Front extends TelecomBlock {

	@Override
	protected void present(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		
		PresentationUtil.addStyleSheetToHeader(iwc, getBundle().getVirtualPathWithFileNameString("style/front.css"));
	}
}