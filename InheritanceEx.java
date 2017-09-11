package com.practice;

import java.util.Scanner;
public class InheritanceEx  {
	 static int a,b,n,result=1;
	static int ch=0;
	
	public static int addition (int a,int b){
		result =a+b;
		System.out.println("The Addition is:-"+result);
		return result;
	}
	public static int substraction(int a,int b) {
		result =a-b;
		System.out.println("The Substraction is:-"+result);
		return result;
	}
	public static int multipliation(int a, int b) {
		result =a*b;
		System.out.println("The Multipliation is:-"+result);
		return result;
	}
	public static  int division(int a,int b) {
		result =a/b;
		System.out.println("The Division is:-"+result);
		return result;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		while(ch!=1){
		System.out.println("Enter the value of First No.:-");
		a=sc.nextInt();
		System.out.println("Enter the value of Second No.:-");
		b=sc.nextInt();
		System.out.println("What you want to do:-1.Addition 2.Substraction 3.Multipliation 4.Division");
		n=sc.nextInt();
		if(n==1){
			addition(a, b);
			}
		if(n==2){
			substraction(a,b);
			}
		if(n==3){
			multipliation(a,b);			
			}
		if(n==4){
			division(a,b);
			}			
		System.out.println("Do u want to add more no.s??:- (yes=0/no=1)");
		ch=sc.nextInt();
		}
	}
}