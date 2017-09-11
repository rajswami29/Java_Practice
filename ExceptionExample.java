package com.practice;

public class ExceptionExample {
	public static void main(String[] args) {
		System.out.println("First line");
		try{
		//System.out.println("String length:-"+s1.length());
		System.out.println("result:-"+3/0);
		}catch (Exception e) {
			System.out.println("Exception:-"+e.getMessage());
			// TODO: handle exception
		}System.out.println("last line");
	}
}
