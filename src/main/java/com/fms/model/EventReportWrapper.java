package com.fms.model;

import java.util.ArrayList;
import java.util.List;

public class EventReportWrapper {
	
	private List<EventDetailResponse> eventSummary = new ArrayList<EventDetailResponse>();

	public List<EventDetailResponse> getEventSummary() {
		return eventSummary;
	}

	public void setEventSummary(List<EventDetailResponse> eventSummary) {
		this.eventSummary = eventSummary;
	}
	
	

}
