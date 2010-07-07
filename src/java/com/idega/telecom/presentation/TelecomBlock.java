package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.block.web2.business.JQuery;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.telecom.TelecomConstants;
import com.idega.telecom.business.TelecomSession;
import com.idega.telecom.services.business.TelecomServices;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public abstract class TelecomBlock extends IWBaseComponent {

	protected static final String PARAMETER_ACTION = "prm_action";
	
	protected static final int ACTION_VIEW = 1;
	protected static final int ACTION_SAVE = 2;
	
	@Autowired
	private TelecomServices services;
	
	@Autowired
	private TelecomSession session;
	
	@Autowired
	private JQuery jQuery;

	private IWBundle iwb;
	private IWResourceBundle iwrb;
	
	@Override
	public void initializeComponent(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		iwb = getBundle(context, getBundleIdentifier());
		iwrb = iwb.getResourceBundle(iwc.getCurrentLocale());
		
		PresentationUtil.addStyleSheetToHeader(iwc, iwb.getVirtualPathWithFileNameString("style/telecom.css"));
		
		present(context);
	}
	
	protected int parseAction(IWContext iwc) {
		int action = ACTION_VIEW;
		if (iwc.isParameterSet(PARAMETER_ACTION)) {
			action = Integer.parseInt(iwc.getParameter(PARAMETER_ACTION));
		}
		
		return action;
	}
	
	protected abstract void present(FacesContext context);
	
	protected TelecomServices getTelecomServices() {
		if (services == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return services;
	}
	
	protected TelecomSession getTelecomSession() {
		if (session == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return session;
	}
	
	protected JQuery getJQuery() {
		if (jQuery == null) {
			ELUtil.getInstance().autowire(this);
		}
		return jQuery;
	}

	protected IWBundle getBundle() {
		return iwb;
	}

	protected IWResourceBundle getResourceBundle() {
		return iwrb;
	}

	public String getBundleIdentifier() {
		return TelecomConstants.IW_BUNDLE_IDENTIFIER;
	}	
}