package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	// HAS-A property(Supporting composition)
	private Date date;

	private Date xxx;
	

	//Que:can i place only private constructor in string bean class?
	//Yes: because spring container internally uses reflection api  
	// constructor injection
	private WishMessageGenerator(Date xxx) {
		System.out.println("WishMessageGenerator- 1 param constructor");
		this.xxx = xxx;

	}
	
	

	// business logic

	public void setDate1(Date date) {
		
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}



	public String generateMessage(String user) {

		System.out.println("WishMessageGenerator.generateMessage()::");
		// get current hour of the day:
		int hour = date.getHours();
		// generate wish message
		if (hour < 12)
			return "GoodMorning:" + user;
		else if (hour < 16)
			return "Good afternoon" + user;
		else if (hour < 20)
			return "Good Evening:" + user;
		else
			return "Good night" + user;
	}

}
