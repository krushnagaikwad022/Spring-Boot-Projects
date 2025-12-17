package com.nt.comp;

public class BudgetCar extends Car {

	private String regNo;
	public BudgetCar(String regNo) {
		this.regNo=regNo;
	}
	@Override
	public void drive() {
		System.out.println("BudgetCar drive methods");

	}

}
