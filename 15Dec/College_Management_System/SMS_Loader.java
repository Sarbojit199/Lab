package com.college;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;



public class SMS_Loader {
	Scanner sc=new Scanner(System.in);
	static long Registration_Id; 
	String name;
	String address;
	long phone;
	String course;
	int Ten_thmarks;
	int HS_marks;
	String year_o_pass;
	long password;
	
	

	
	public void storeData() throws Exception {
Registration_Id =(long) Math.random();
		
		System.out.println("Enter password");
		 password= sc.nextLong();
	
		
		System.out.println("Enter name");
		name=sc.next();
	
		System.out.println("Enter address ");
		address=sc.next();
		System.out.println("Enter phone");
		phone=sc.nextLong();
			System.out.println("Enter course ");
		course=sc.next();
		System.out.println("enter class 10th_marks");
		Ten_thmarks=sc.nextInt();
	
		System.out.println("Enter class 12th marks ");
		HS_marks=sc.nextInt();
		
	/*	System.out.println("enter year of pass");
		year_o_pass=sc.next();
		SimpleDateFormat format= new SimpleDateFormat("E,MMM dd yyyy");
				
		Date date=format.parse(year_o_pass); */
		
		
		
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
	
				PreparedStatement pstmt=conn.prepareStatement("insert into admission values(?,?,?,?,?,?,?,?)");
				pstmt.setLong(1, Registration_Id);
				pstmt.setString(2, name);
				pstmt.setString(3, address);
				pstmt.setLong(4, phone);
				pstmt.setString(5, course);
				pstmt.setInt(6,Ten_thmarks );
				pstmt.setInt(7,HS_marks);
				pstmt.setLong(8, password);
			
				pstmt.executeUpdate();
				System.out.println("Account created successfully");
			}
	
	
	
	
	public void displayData() throws Exception{
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("Enter registration_id ");
		Registration_Id=sc.nextLong();
		System.out.println("Enter password : ");
		password=sc.nextInt();
		ResultSet rs=stmt.executeQuery("select * from admission where Registration_Id="+Registration_Id);
		
		while(rs.next()) {
			if((rs.getDouble(6)>70) && (rs.getDouble(7)>70)) {
			System.out.println("[Registration id] : "+rs.getDouble(1)+"\n[name] : "+rs.getString(2)
						+"\n[Address] : "+rs.getString(3)+"\n[Phone] : "+
						rs.getLong(4)+"\n[course] : "+rs.getString(5)+
				"\n[10th_marks] : "+rs.getDouble(6)+"\n[12Th_marks] : "+rs.getDouble(7)+"\n[Password] : "+rs.getLong(8));
			System.out.println("You are elligible for addmission");
			
			}
			else {
				System.out.println("your not elligible for admission");
			}
		}
	
			
			
		
	
	}
	
	
	}
	


