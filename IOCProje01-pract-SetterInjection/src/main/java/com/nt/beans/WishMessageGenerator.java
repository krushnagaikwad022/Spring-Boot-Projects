package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
	
	 public WishMessageGenerator() {
		System.out.println("wishmessagegenerator - 0 param constructor");
	}

	public void setDate(Date date) {
		System.out.println("wishmessage generator-setDate()");
		this.date = date;
	}

	// business method
	public String generateMessage(String user) {
		System.out.println("wishmessagegenerator.generateMessage():");

		// Get current hour of date
		int hour = date.getHours();

		// generate wish message
		if (hour < 12)
			return "good morning" + user;
		else if (hour < 16)
			return "good afternoon" + user;
		else if (hour < 20)
			return "good evening" + user;
		else

			return "Good night" + user;

	}

}
