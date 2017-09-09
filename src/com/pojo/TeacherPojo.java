package com.pojo;

import java.io.Serializable;
public class TeacherPojo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int teacherid ;
	String teachername;
	String teacheraddress;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacgherid) {
		this.teacherid = teacgherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getTeacheraddress() {
		return teacheraddress;
	}
	public void setTeacheraddress(String teacheraddress) {
		this.teacheraddress = teacheraddress;
	}
	public TeacherPojo(int teacherid, String teachername, String teacheraddress) {
		super();
		this.teacherid = teacherid;
		this.teachername = teachername;
		this.teacheraddress = teacheraddress;
	}
	public TeacherPojo() {
		super();
	}
	@Override
	public String toString() {
		return "TeacherPojo [Teacher ID =" + teacherid + ", Teacher name=" + teachername + ", Teacher address="
				+ teacheraddress + "]";
	}
}