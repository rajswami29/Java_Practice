package com.practice;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Object> al= new ArrayList<>();
	System.out.println("Initial size of ArrayList :-" +al.size());
	al.add("a");
	al.add("s");
	al.add("s");
	al.add("s");
	al.add("s");
	al.add("s");
	al.add("s");
	al.add("s");
	al.add("s");
	System.out.println("Size of arraylist after adding objects:-"+al.size());
	System.out.println("Contents of al:-" +al);
	ArrayList<Object> al1= new ArrayList<Object>(10);
	System.out.println("Initial size of ArrayList :-" +al1.size());
	al1.add("a");
	al1.add("s");
	al1.add("s");
	al1.add("s");
	al1.add("s");
	al1.add("s");
	al1.add("s");
	al1.add("s");
	System.out.println(	al1.add("r"));
	al1.add("s");
	System.out.println("Size of arraylist after adding objects:-"+al1.size());
	System.out.println("Contents of al:-" +al1);
	al1.remove("s");
	System.out.println("Size of arraylist after deletion objects:-"+al1.size());
	System.out.println("Contents of al:-" +al1);
	al1.set(2, "b");
	System.out.println("Contents of al1 after setmethod:-" +al1+"size:-"+al1.size());
	System.out.println(al1.lastIndexOf("a"));
}
}
