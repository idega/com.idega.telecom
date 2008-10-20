package com.idega.telecom.presentation;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.Block;
import com.idega.presentation.IWContext;
import com.idega.presentation.Layer;
import com.idega.presentation.text.Heading1;
import com.idega.telecom.TelecomConstants;
import com.idega.telecom.services.business.TelecomServices;
import com.idega.util.PresentationUtil;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

public class TelecomBlock extends Block {
	
	private String beanIdentifier;
	
	private TelecomServices telecomServices;
	
	private IWBundle bundle;
	private IWResourceBundle resourceBundle;
	
	@Override
	public void main(IWContext iwc) throws Exception {		
		bundle = getBundle(iwc);
		resourceBundle = bundle.getResourceBundle(iwc);
		
		PresentationUtil.addStyleSheetToHeader(iwc, bundle.getVirtualPathWithFileNameString("style/telecom.css"));
		
		if (StringUtil.isEmpty(beanIdentifier)) {
			add(getErrorMessage(resourceBundle.getLocalizedString("select_services_provider_first", "Please, select services provider first!")));
			
			throw new NullPointerException("Spring bean must be provided!");
		}
		
		if (getTelecomServices() == null) {
			add(getErrorMessage(resourceBundle.getLocalizedString("unable_to_contact_selected_services_provider",
																"Sorry, uanble to contact selected services provider")));
			
			throw new NullPointerException("Unable to get Spring bean: " + beanIdentifier);
		}
	}
	
	protected Layer getErrorMessage(String errorMessage) {
		Layer container = new Layer();
		add(container);
		container.setStyleClass("errorMessage");
		container.add(new Heading1(errorMessage));
		return container;
	}
	
	protected TelecomServices getTelecomServices() {
		try {
			telecomServices = ELUtil.getInstance().getBean(beanIdentifier);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return telecomServices;
	}
	
	protected IWBundle getBundle() {
		return bundle;
	}

	protected IWResourceBundle getResourceBundle() {
		return resourceBundle;
	}

	public String getBeanIdentifier() {
		return beanIdentifier;
	}

	public void setBeanIdentifier(String beanIdentifier) {
		this.beanIdentifier = beanIdentifier;
	}

	@Override
	public String getBundleIdentifier() {
		return TelecomConstants.IW_BUNDLE_IDENTIFIER;
	}
	
}
