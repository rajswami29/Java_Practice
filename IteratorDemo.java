package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		List<Object> l =new ArrayList<>();
		Student s= new Student(1, "Asif");
		Student s1 = new Student(2,"Pramod");
		l.add(s);
		l.add(s1);
		System.out.println(l);
		Iterator<Object> itr = l.iterator();
		ListIterator<Object> ltr=l.listIterator();
		//System.out.println(l);
		
		//System.out.println(s2);
		
		while(ltr.hasNext())
		{
		ltr.set(s1);
		System.out.println(l);
		}
		
		while(itr.hasNext()){
			Student s2 =(Student) itr.next();
			if (s2.getId()==2){
			itr.remove();	
		}
		}
		System.out.println(l);
				System.out.println(ltr.hasPrevious());
				System.out.println(ltr.hasNext());
				System.out.println(ltr.nextIndex());
	}
}