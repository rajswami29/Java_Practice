package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileOutputStreamEx {
	public void setinfo(){ 
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		ObjectOutputStream oos=null;
		try {
			FileOutputStream fos= new FileOutputStream("Test.txt");
			oos=  new ObjectOutputStream(fos);
			Student s= new  Student();
			System.out.println("Enter ID of student:-");
			s.setId(sc.nextInt());
			System.out.println("Enter name oof student:-");
			s.setName(sc.next());
			System.out.println(s);
			 System.out.println("Do you want to add more records:-yes/ No");
			 int ch=sc.nextInt();
			 if(ch==1){
				setinfo(); 
			 }else{
			 oos.writeObject(s);
			System.out.println("Records added....");
			 }
			fos.close();
			oos.close(); 
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getinfo(){
		FileInputStream fis =null;
		ObjectInputStream ois= null;
		Student s1 =new Student();
		try {
			fis= new FileInputStream("Test.txt");
			ois= new ObjectInputStream(fis);
			s1=(Student) ois.readObject();
			System.out.println(s1);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	FileOutputStreamEx f1= new FileOutputStreamEx();
	f1.setinfo();
	f1.getinfo();
	}		
}

