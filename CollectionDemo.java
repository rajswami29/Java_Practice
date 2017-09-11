package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
	public static void main(String[] args) {
		
	
	//Arraylist
	List<Object> al = new  ArrayList<Object>();
	System.out.println("Initial size od al:-"+al.size());
	al.add("Pramod");
	al.add("Dayanand");
	al.add("Swami");
	System.out.println("Contents of al:-"+al);
	System.out.println("Collection is Empty :-"+al.isEmpty());
	System.out.println("Element at index 2:-"+al.get(2));
	
	//Linkedlist
	List<Object> al1 = new  LinkedList<Object>();
	System.out.println("Initial size od al:-"+al1.size());
	al1.add("Pramod");
	al1.add("Dayanand");
	al1.add("Swami");
	System.out.println("Contents of al:-"+al1);
	System.out.println("Collection is Empty :-"+al1.isEmpty());
	System.out.println("Element at index 2:-"+al1.get(2));
	
	//Hashset
	Set<String> s= new HashSet<String>();
	s.add("Pramod");
	s.add("Dayanand");
	s.add("Swami");
	System.out.println(s);
	
	//Map
	Map<Object, Object> m= new HashMap<Object, Object>();
	m.put("value1", 1);
	m.put("value2", 2);
	m.put("value3", 8);
	m.put("value4", 3);
	System.out.println(m);
	
	}	
}
