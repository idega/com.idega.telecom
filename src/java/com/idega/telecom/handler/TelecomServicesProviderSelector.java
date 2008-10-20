package com.idega.telecom.handler;

import java.util.List;

import com.idega.core.builder.presentation.ICPropertyHandler;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.IWContext;
import com.idega.presentation.PresentationObject;
import com.idega.presentation.ui.DropdownMenu;
import com.idega.presentation.ui.SelectOption;
import com.idega.telecom.TelecomConstants;
import com.idega.util.StringUtil;

public class TelecomServicesProviderSelector implements ICPropertyHandler {

	public List<?> getDefaultHandlerTypes() {
		return null;
	}

	public PresentationObject getHandlerObject(String name, String stringValue, IWContext iwc, boolean oldGenerationHandler, String instanceId, String method) {
		IWResourceBundle iwrb = iwc.getIWMainApplication().getBundle(TelecomConstants.IW_BUNDLE_IDENTIFIER).getResourceBundle(iwc);
		
		DropdownMenu providers = new DropdownMenu("telecomServicesProviderSelector");
		providers.addFirstOption(new SelectOption(iwrb.getLocalizedString("select_telecom_services_provider", "Select telecom services provider"), -1));
		
		for (String beanIdentifier: TelecomConstants.ALL_TELECOM_SERVICES_PROVIDERS) {
			providers.addOption(new SelectOption(iwrb.getLocalizedString(beanIdentifier, beanIdentifier), beanIdentifier));
		}
		if (!StringUtil.isEmpty(stringValue)) {
			providers.setSelectedElement(stringValue);
		}
		
		return providers;
	}

	public void onUpdate(String[] values, IWContext iwc) {
	}

}
