package com.practice;

public class ThreadExample {
	public static void main(String[] args) {
		Thread t1= new Thread(new A());
		Thread t2 =new Thread(new B()); 
		System.out.println("Thread t1's priority :-"+t1.getPriority()+" Thread t2's priority :-"+t2.getPriority());
		t1.setPriority(4);
		t1.start();
		t2.start();
		System.out.println("Thread t1's priority :-"+t1.getPriority()+"Thread t2's priority :-"+t2.getPriority());
	}
}
