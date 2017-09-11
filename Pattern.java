package com.practice;

import java.util.Scanner;

public class Pattern { 
	
	public static void main(String[] args) {
		int i,j,n;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no. of rows:-");
		n=scanner.nextInt();
		for (i=0;i<n;i++){
			for (int k=n;k>=i;k++)
				{System.out.println(" ");}
			for(j=n;j>i;j--){
				System.out.print("*");
			}
		}System.out.println(" ");
	}
}
