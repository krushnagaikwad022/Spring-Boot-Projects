package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	// HAS-A property(Supporting composition)
	private Date date;

	
	//constructor injection
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator- 1 param constructor");
		this.date=date;
		
		
	}
	
	public void setDate1(Date date) {
		
		this.date=date;
	}
	
	
	//business logic
	
	public String generateMessage(String user) {
		
		System.out.println("WishMessageGenerator.generateMessage()::");
		//get current hour of the day:
		int hour=date.getHours();
		//generate wish message
		if(hour < 12)
			return "GoodMorning:"+user;
		else if(hour<16)
			return "Good afternoon"+user;
		else if(hour<20)
			return "Good Evening:"+user;
		else 
		return "Good night"+user;
	}
	

}
