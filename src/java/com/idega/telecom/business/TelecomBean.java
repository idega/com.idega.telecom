package com.idega.telecom.business;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.telecom.services.bean.UsageEntry;

@Scope("request")
@Service("telecomBean")
public class TelecomBean {

	private List<UsageEntry> entries;
	private Date fromDate;
	private Date toDate;

	public List<UsageEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<UsageEntry> entries) {
		this.entries = entries;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
}