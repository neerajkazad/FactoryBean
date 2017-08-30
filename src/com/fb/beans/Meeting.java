package com.fb.beans;

import java.util.Arrays;
import java.util.Calendar;

public class Meeting {
	private int meetingNo;
	private String description;
	private Calendar scheduleDate;
	private String[] participants;

	public int getMeetingNo() {
		return meetingNo;
	}

	public void setMeetingNo(int meetingNo) {
		this.meetingNo = meetingNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Calendar scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String[] getParticipants() {
		return participants;
	}

	public void setParticipants(String[] participants) {
		this.participants = participants;
	}

	public String toString() {
		return "Meeting [meetingNo=" + meetingNo + ", description="
				+ description + ", scheduleDate=" + scheduleDate.getTime()
				+ ", participants="
				+ (participants != null ? Arrays.asList(participants) : null)
				+ "]";
	}

	
}
