package com.idega.telecom.business;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.telecom.services.bean.UsageEntry;

@Scope("request")
@Service("telecomBean")
public class TelecomBean {

	private List<UsageEntry> entries;
	private Map<UsageEntry, List<UsageEntry>> entriesMap;
	private Map<UsageEntry, Map<UsageEntry, List<UsageEntry>>> subEntriesMap;
	private Date fromDate;
	private Date toDate;

	public List<UsageEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<UsageEntry> entries) {
		this.entries = entries;
	}

	public Map<UsageEntry, List<UsageEntry>> getEntriesMap() {
		return entriesMap;
	}

	public void setEntriesMap(Map<UsageEntry, List<UsageEntry>> entriesMap) {
		this.entriesMap = entriesMap;
	}

	public Map<UsageEntry, Map<UsageEntry, List<UsageEntry>>> getSubEntriesMap() {
		return subEntriesMap;
	}

	public void setSubEntriesMap(Map<UsageEntry, Map<UsageEntry, List<UsageEntry>>> subEntriesMap) {
		this.subEntriesMap = subEntriesMap;
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