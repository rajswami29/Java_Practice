package com.main;

import com.daoimlp.StudentImpl;
import com.daoimlp.TeacherImpl;

public class Controller {
	public static void main(String[] args) {
		//int ch=0;
		//int n=0;
		//Scanner sc=new Scanner(System.in);
		StudentImpl s1 = new StudentImpl();
		TeacherImpl t1 = new TeacherImpl();
		s1.setStudent();
		t1.setTeacher();
		s1.getStudent();
		t1.getTeacher();
		/*System.out.println("Do you want to:-1.Add records 2. View records 3. Search records");
		ch =sc.nextInt();
		if(ch==1){
			System.out.println("Do you want to add records of 1.Student or 2.Teacher");
			n= sc.nextInt();
			if(n==1){
				s1.setStudent();	
			}else if (n==2) {
				t1.setTeacher();
			}else if(n==3){
				System.out.println("Do you add more records of 1.Student or 2.Teacher");
				n=sc.nextInt();
			}
		}else if (ch==2) {
			System.out.println("Do you want to add records of 1.Student or 2.Teacher");
			n= sc.nextInt();
			if(n==1){
				s1.getStudent();
				}else if (n==2) {
				t1.getTeacher();
				}
		}*/
	}
}
