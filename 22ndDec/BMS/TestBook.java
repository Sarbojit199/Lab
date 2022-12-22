package com.Hb2.Demo;

import java.util.Scanner;

import com.Hb2.DaoImpl.BookDaImpl;

//import com.Hb2.DaoImpl.BookDaImpl;

import jakarta.persistence.RollbackException;
import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.SystemException;

public class TestBook {
	public static void main( String[] args ) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
		
		BookDaImpl i=new BookDaImpl();
	
		
		
		char ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to user portal");
		System.out.println("Enter choice");
		System.out.println(" 1. Add  2. Read  3. Update  4. Delete  5.Exit");
		
		int ch=sc.nextInt();
		do {
			switch(ch){
			case 1:
				i.addBook();
			break;
			case 2:
				i.readBook();
				break;
			
			
			case 5:
				System.exit(0);
				break;
			default:
					System.out.println("Invalid choice");
					break;
		}
			System.out.println("do you want to do the process again ? y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='y' || ans=='Y');{
			System.out.println("Thank you!");
		}
		
		
		
    }
}
