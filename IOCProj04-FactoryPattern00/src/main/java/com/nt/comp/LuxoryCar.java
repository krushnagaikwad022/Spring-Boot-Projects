package com.nt.comp;

public class LuxoryCar extends Car {

	private String regNo;
	
	public LuxoryCar(String regNo) {
		this.regNo=regNo;
	}
	
	
	@Override
	public void drive() {

		System.out.println("Luxory drive() method");
	}

}
