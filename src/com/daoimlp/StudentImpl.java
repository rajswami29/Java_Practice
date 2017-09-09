package com.daoimlp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.dao.StudentDao;
import com.pojo.StudentPojo;

public class StudentImpl implements StudentDao{
	Scanner sc=new Scanner(System.in);
	FileOutputStream fos = null;
	ObjectOutputStream oos= null;
	int ch =0;
	@Override
	public void setStudent() {
		try {
			 fos = new FileOutputStream("StudentData.txt",true);
			 oos = new ObjectOutputStream(fos);
			 /*StudentPojo s1 = new StudentPojo(1,"Swami","Jath");
			 StudentPojo s2 = new StudentPojo(2,"Swami","Jath");
			 StudentPojo s3 = new StudentPojo(3,"Swami","Jath");
			 StudentPojo s4 = new StudentPojo(4,"Swami","Jath");
			 oos.writeObject(s1);
			 oos.writeObject(s2);
			 oos.writeObject(s3);
			 oos.writeObject(s4);
			 */
			 StudentPojo s = new StudentPojo();
			 System.out.println("Enter ID of student:-");
			 s.setStudentid(sc.nextInt());
			 System.out.println("Enter Name of Student:-");
			 s.setStudentname(sc.next());
			 System.out.println("Enter Address of student:-");
			 s.setStudentaddress(sc.next());
			 System.out.println("Do you want to add more records:-yes/ No");
			 ch=sc.nextInt();
			 if(ch==1){
				setStudent(); 
			 }else{
			 oos.writeObject(s);
			System.out.println(s);
			 System.out.println("Records added....");
			 }
			 oos.close();
			 fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void getStudent() {
		FileInputStream fis =null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("StudentData.txt");
			ois = new ObjectInputStream(fis);
			//System.out.println("hii");
			//list=(ArrayList<StudentPojo>) ois.readObject();
			StudentPojo s1= (StudentPojo) ois.readObject();
			//System.out.println(s1);
			/*StudentPojo s2= (StudentPojo) ois.readObject();
			StudentPojo s3= (StudentPojo) ois.readObject();
			StudentPojo s4= (StudentPojo) ois.readObject();
			
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
*/			fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchStudent(){
		FileInputStream fis =null;
		ObjectInputStream ois = null;
		int count=0;
		StudentPojo s1= new StudentPojo();
		Object id;
		System.out.println("Enter student id to search:-");
		sc.nextInt();
		try {
				fis = new FileInputStream("StudentData.txt");
				ois= new ObjectInputStream(fis);
				s1=(StudentPojo) ois.readObject();
				System.out.println(s1.getStudentid());
				System.out.println(s1);
				/*if(id=a){
					System.out.println("record found");
				}*/
				} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
public static void main(String[] args) {
	StudentImpl s1 =new StudentImpl();
	s1.setStudent();
	s1.getStudent();
	s1.searchStudent();
}
}