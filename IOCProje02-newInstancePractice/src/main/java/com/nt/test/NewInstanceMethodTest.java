package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodTest {
	
	public static void main(String[] args) throws Exception {
		
		//Load classes
		
		Class c1=Class.forName(args[0]);
		
		//Get all constructor of loaded class
		Constructor cons[]=c1.getDeclaredConstructors();
		
		//Dynamic object create using 0-param constructor
		Object obj1=cons[0].newInstance();
		System.out.println(obj1);
		System.out.println("-------------------");
		
		//Dynamic object create using 2-param constructor
		Object obj2=cons[1].newInstance(100,"krushna");
		System.out.println(obj2);
		
		
	
		
	}

}
