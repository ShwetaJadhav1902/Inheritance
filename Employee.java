package com.inheritance;

public class Employee {
	private int basicSal;
	private double hra;
	private double da;
	
	public Employee(int basicSal,double hra,double da) {
		this.basicSal=basicSal;
		this.hra=hra;
		this.da=da;
	}
	
	public double calculateSalary() {
		return basicSal+hra+da;
	}

}
