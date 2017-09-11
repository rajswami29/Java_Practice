package com.practice;

import java.util.Scanner;

public class StudentMarks extends InheritanceEx {
			
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter the marks of 1st Subject:-");
			a= sc.nextInt();
			System.out.println("Enter the marks of 2ed Subject:-");
			b= sc.nextInt();
			System.out.println(addition(a,b));
	}
}
