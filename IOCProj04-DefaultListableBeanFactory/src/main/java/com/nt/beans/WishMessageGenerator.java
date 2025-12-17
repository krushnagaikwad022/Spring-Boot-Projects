package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

    private Date date;

    public WishMessageGenerator(Date date) {
        System.out.println("WishMessageGenerator- 1 param constructor");
        this.date = date;
    }

    public void setDate1(Date date) {
        this.date = date;
    }

    public String generateMessage(String user) {
        System.out.println("WishMessageGenerator.generateMessage()::");
        int hour = date.getHours();

        if (hour < 12)
            return "Good Morning: " + user;
        else if (hour < 16)
            return "Good Afternoon: " + user;
        else if (hour < 20)
            return "Good Evening: " + user;
        else
            return "Good Night: " + user;
    }
}
