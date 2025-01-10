package com.inheritance;

public class Manager extends Employee{
	private double inc;
	
	public Manager(int basicSal,double hra,double da, double inc) {
		super(basicSal,hra,da);
		this.inc=inc;
	}
	
public double calculateInc() {
	return inc;
}
}
