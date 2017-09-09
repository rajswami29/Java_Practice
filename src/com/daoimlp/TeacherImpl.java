package com.daoimlp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.List;
import java.util.Scanner;

import com.dao.TeacherDao;
import com.pojo.TeacherPojo;

public class TeacherImpl implements TeacherDao {
	Scanner sc=new Scanner(System.in);
	FileOutputStream fos = null;
	ObjectOutputStream oos= null;
	ArrayList< TeacherPojo> al= new ArrayList<>(); 
	//TeacherPojo t=new TeacherPojo();
	int ch=0;

	@Override
	public void setTeacher() {
			try {
				fos= new FileOutputStream("TeacherData.txt");
				oos=new ObjectOutputStream(fos);
				TeacherPojo t = new TeacherPojo(1,"pramod","pune");
				TeacherPojo t2 = new TeacherPojo(2,"pramod","pune");
				TeacherPojo t3 = new TeacherPojo(3,"pramod","pune");
				TeacherPojo t4 = new TeacherPojo(4,"pramod","pune");
				oos.writeObject(t);
				oos.writeObject(t2);
				oos.writeObject(t3);
				oos.writeObject(t4);
				/*System.out.println("Enter ID of Teacher :-");
				t.setTeacherid(sc.nextInt());
				System.out.println("Enter Name of teacher:-");
				t.setTeachername(sc.next());
				System.out.println("Enter address of Teacher:-");
				t.setTeacheraddress(sc.next());
				System.out.println("Do you want to add more records:-yes/No");
				ch=sc.nextInt();
				if(ch==1){
					setTeacher();
				}else{
				al.add(t);
				oos.writeObject(al);
				//System.out.println(t);
				System.out.println("Record added in array list.....");
				}*/
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void getTeacher() {
		// TODO Auto-generated method stub
		FileInputStream fis= null;
		ObjectInputStream ois= null;
		//ArrayList<TeacherPojo> al1;
		try {
			fis= new FileInputStream("TeacherData.txt");
			ois=new ObjectInputStream(fis);
			TeacherPojo t1= (TeacherPojo) ois.readObject();
			TeacherPojo t2= (TeacherPojo) ois.readObject();
			TeacherPojo t3= (TeacherPojo) ois.readObject();
			TeacherPojo t4= (TeacherPojo) ois.readObject();
			System.out.println(t1);
			System.out.println(t2);
			System.out.println(t3);
			System.out.println(t4);
		/*	al1 = (ArrayList<TeacherPojo>) ois.readObject();	
			while(al1!=null){
			for(TeacherPojo t1:al1){
			//al1.get(al1);
			//System.out.println(al1);
				System.out.println("ID"+t1.getTeacherid()+" Name"+t1.getTeachername()+"Address"+t1.getTeacheraddress());
			}
		*/	fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}
		/*public void searchTeacher(int id){
	        try
	        {
	        File file = new File("TeacherData.txt");
	        BufferedReader read = new BufferedReader(new FileReader(file));
	        String str;
	         while((str=read.readLine())!=null)
	         {
	            TeacherPojo s=null;
	            if(s.getTeacherid()==id)
	                System.out.println(s);
	            	System.out.println("hiii");
	         }
	         read.close();
	            }
	        catch(IOException e) { System.out.println(e); }
	    }*/
/*public static void main(String[] args) {
	TeacherImpl t1= new TeacherImpl();
	t1.setTeacher();
	t1.getTeacher();
	//t1.searchTeacher(1);
}*/
}
