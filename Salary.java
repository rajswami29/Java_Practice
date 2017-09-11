package com.practice;

public class Salary extends Employee {
	public double salary;

	
	public Salary(String name, String address, int num, double salary) {
		super(name, address, num);
		setSalary(salary);
	}
	public void mailCheck() {
		System.out.println("mailcheck() of salary class");
		System.out.println("Mail check"+getName() +"with salary "+this.salary);
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
