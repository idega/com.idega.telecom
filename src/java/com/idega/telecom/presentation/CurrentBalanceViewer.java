package com.idega.telecom.presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.presentation.IWContext;
import com.idega.presentation.ui.handlers.IWDatePickerHandler;
import com.idega.telecom.business.TelecomBean;
import com.idega.telecom.services.bean.Phone;
import com.idega.telecom.services.bean.UsageEntry;
import com.idega.util.IWTimestamp;
import com.idega.util.PresentationUtil;

public class CurrentBalanceViewer extends TelecomBlock {

	private static final String PARAMETER_FROM_DATE = "prm_from_date";
	private static final String PARAMETER_TO_DATE = "prm_to_date";
	
	@Override
	protected void present(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		
		Phone phone = getTelecomSession().getPhone();
		if (phone != null) {
			Date fromDate = iwc.isParameterSet(PARAMETER_FROM_DATE) ? new IWTimestamp(IWDatePickerHandler.getParsedDate(iwc.getParameter(PARAMETER_FROM_DATE))).getDate() : null;
			if (fromDate == null) {
				IWTimestamp stamp = new IWTimestamp();
				stamp.addWeeks(-2);
				fromDate = stamp.getDate();
			}
			
			Date toDate = iwc.isParameterSet(PARAMETER_TO_DATE) ? new IWTimestamp(IWDatePickerHandler.getParsedDate(iwc.getParameter(PARAMETER_TO_DATE))).getDate() : null;
			if (toDate == null) {
				IWTimestamp stamp = new IWTimestamp();
				toDate = stamp.getDate();
			}
			
			Map<UsageEntry, Map<UsageEntry, List<UsageEntry>>> map = getTelecomServices().getUsageEntriesByNumber(phone.getNumber(), new IWTimestamp(fromDate).toSQLDateString(), new IWTimestamp(toDate).toSQLDateString());
			Map<UsageEntry, List<UsageEntry>> innerMap = null;
			List<UsageEntry> entries = null;
			
			for (UsageEntry entryType : map.keySet()) {
				/*List<UsageEntry> typeEntries = map.get(entryType);
				
				int count = typeEntries.size();
				float total = 0;
				for (UsageEntry usageEntry : typeEntries) {
					total += usageEntry.getAmount();
				}
				
				UsageEntry entry = new UsageEntry();
				entry.setAmount(total);
				entry.setEntryType(entryType);
				entry.setNumber(Integer.toString(count));
				entries.add(entry);*/
			}
			
			
			TelecomBean bean = getBeanInstance("telecomBean");
			bean.setEntries(entries);
			bean.setEntriesMap(map);
			bean.setFromDate(fromDate);
			bean.setToDate(toDate);

			PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getJQuery().getBundleURIToJQueryLib());
			PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getBundle().getVirtualPathWithFileNameString("javascript/balanceViewer.js"));

			FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
			facelet.setFaceletURI(getBundle().getFaceletURI("balanceViewer/all.xhtml"));
			add(facelet);
		}
	}	
}