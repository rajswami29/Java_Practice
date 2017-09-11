package com.practice;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n){
		if(n==0){
			return 1;
		}else
		{
			return n*(factorial(n-1));
		}
}
public static void main(String[] args) {
	int n;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No:-");
	n=sc.nextInt();
	System.out.println("factrial:-"+factorial(n));
}
}
