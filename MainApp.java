package com.inheritance;


public class MainApp {
	public static void main(String[]args) {
		
		Manager mgr=new Manager(45000,5607,450,6700);
		double sal=mgr.calculateSalary();
		double inc=mgr.calculateInc();
		
		System.out.println("Total Salary : "+(sal+inc));
		
		
	}

}
