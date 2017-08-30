package com.fb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean {

	private int day;
	private int month;
	private int year;
	
	public CalendarFactoryBean(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Object getObject() throws Exception {
		System.out.println("getObject()");
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		return calendar;
	}

	public Class getObjectType() {
		System.out.println("getObjectType()");
		return Calendar.class;
	}

	public boolean isSingleton() {
		System.out.println("isSingleton()");
		return true;
	}
	
}
