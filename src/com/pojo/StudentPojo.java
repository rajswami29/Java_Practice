package com.pojo;

import java.io.Serializable;
public class StudentPojo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int studentid;
	private String studentname;
	private String studentaddress;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	@Override
	public String toString() {
		return "StudentPojo [Student ID=" + studentid + ", Student name=" + studentname + ", Student Address="+ studentaddress + "]";	
	}
	public StudentPojo(int studentid, String studentname, String studentaddress) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
	}
	public StudentPojo() {
		super();
	}
}
