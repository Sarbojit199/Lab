package com.college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Helper {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	public static Connection con() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","567890");
		}
	public static void main(String[] args) throws SQLException{
		SMS_Loader s=new SMS_Loader();
		Scanner sc=new Scanner(System.in);
		System.out.println("******Welcome to College Management System******");
		while(true) {
			System.out.println("[1. Registration],"
					+ "[2.Login Acount],"
					+ "[3.Admission],"
					+ "[4.Display],"
					+"[5.Update],"
					+ "[0.Exit]");
			int choice=sc.nextInt();
			while(!(choice>=0 && choice<6)) {
				System.out.println("!!Invalid choice!!\nTry Again : ");
				choice=sc.nextInt();
			}
			if(choice==0) {
				System.out.println("******!!Thank you for choosing our bank!!******");
				break;
			}else {
				try {
					if(choice==1) {
						s.storeData();
					} else if(choice==2) {
						s.displayData();
					}
				}
					catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}}}
}
			
