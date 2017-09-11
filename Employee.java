package com.practice;

public class Employee {
	private String name;
	private String address;
	int num;
	public Employee(String name, String address, int num) {
		super();
		this.name = name;
		this.address = address;
		this.num = num;
	}
	public void mailCheck() {
		System.out.println("Mail check"+this.name +" "+this.address);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", num=" + num + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
