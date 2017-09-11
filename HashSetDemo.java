package com.practice;

import java.util.HashSet;

public class HashSetDemo {
	
public static void main(String[] args) {
	HashSet<Object> hs = new HashSet<>();
	Student std = new Student(1,"Pramod");
	Student std1 = new Student(2,"Pramod");
	Student std2 = new Student(3,"Pramod");
	Student std3 = new Student(1,"Pramod");
	Student std4 = new Student(4,"Pramod");
	Student std5 = new Student(5,"Pramod");
	Student std6 = new Student(6,"Pramod");
	hs.add(std6);
	hs.add(std5);
	hs.add(std4);
	hs.add(std3);
	hs.add(std2);
	hs.add(std1);
	hs.add(std);
	System.out.println(hs);
}
}
