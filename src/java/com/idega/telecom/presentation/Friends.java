package com.idega.telecom.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.presentation.IWContext;
import com.idega.telecom.services.bean.FriendNumber;
import com.idega.util.PresentationUtil;

public class Friends extends TelecomBlock {
	
	private static final String PARAMETER_FRIEND_NUMBER = "prm_friend_number";

	@Override
	protected void present(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		
		if (getTelecomSession().getPhone() != null) {
			if (iwc.isParameterSet(PARAMETER_ACTION)) {
				save(iwc);
			}
			view(iwc);
		}
	}

	private void view(IWContext iwc) {
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getJQuery().getBundleURIToJQueryLib());
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getBundle().getVirtualPathWithFileNameString("javascript/friends.js"));

		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(getBundle().getFaceletURI("friends/view.xhtml"));
		add(facelet);
	}
	
	private void save(IWContext iwc) {
		List<FriendNumber> friendNumbers = new ArrayList<FriendNumber>();

		String[] numbers = iwc.getParameterValues(PARAMETER_FRIEND_NUMBER);
		for (String string : numbers) {
			if (string.length() > 0) {
				FriendNumber number = new FriendNumber();
				number.setFriendNumber(string);
				friendNumbers.add(number);
			}
		}
		
		getTelecomServices().registerFriendPhone(friendNumbers);
	}
}