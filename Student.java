package com.practice;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Id=" + id + ",Name=" + name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public boolean equals(Object obj){
		//Student std=new Student();
		if (obj instanceof Student){
		return this.name== this.name;
		}else
		{
		return false;
	}
}
	public int hashCode(){
		//int n= (int)name;
		return this.id;
}
}
