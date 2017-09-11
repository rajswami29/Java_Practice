package com.practice;

public class A implements Runnable{
	public void run(){
	int i=0;
	for(i=0;i<=10;i++)
		{System.out.println("Thread A "+i);}
	}
	}