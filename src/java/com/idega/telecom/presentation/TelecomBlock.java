package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.presentation.Layer;
import com.idega.presentation.text.Heading1;
import com.idega.telecom.TelecomConstants;
import com.idega.telecom.services.business.TelecomServices;
import com.idega.util.PresentationUtil;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

public abstract class TelecomBlock extends IWBaseComponent {
	
	private String beanIdentifier;
	
	private TelecomServices telecomServices;
	
	private IWBundle iwb;
	private IWResourceBundle iwrb;
	
	@Override
	public void initializeComponent(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		iwb = getBundle(context, getBundleIdentifier());
		iwrb = iwb.getResourceBundle(iwc.getCurrentLocale());
		
		PresentationUtil.addStyleSheetToHeader(iwc, iwb.getVirtualPathWithFileNameString("style/telecom.css"));
		
		if (StringUtil.isEmpty(beanIdentifier)) {
			add(getErrorMessage(iwrb.getLocalizedString("select_services_provider_first", "Please, select services provider first!")));
			throw new NullPointerException("Spring bean must be provided!");
		}
		
		if (getTelecomServices() == null) {
			add(getErrorMessage(iwrb.getLocalizedString("unable_to_contact_selected_services_provider", "Sorry, uanble to contact selected services provider")));
			throw new NullPointerException("Unable to get Spring bean: " + beanIdentifier);
		}
		
		present(context);
	}
	
	public abstract void present(FacesContext context);
	
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
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return telecomServices;
	}
	
	protected IWBundle getBundle() {
		return iwb;
	}

	protected IWResourceBundle getResourceBundle() {
		return iwrb;
	}

	public String getBeanIdentifier() {
		return beanIdentifier;
	}

	public void setBeanIdentifier(String beanIdentifier) {
		this.beanIdentifier = beanIdentifier;
	}

	public String getBundleIdentifier() {
		return TelecomConstants.IW_BUNDLE_IDENTIFIER;
	}	
}