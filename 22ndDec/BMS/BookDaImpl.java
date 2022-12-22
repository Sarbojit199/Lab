package com.Hb2.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.Hb2.Dao.BookDao;
import com.Hb2.Demo.Book_Details;

public class BookDaImpl implements BookDao{
	Scanner sc=new Scanner(System.in);

	
		public void addBook() {
			
			 Configuration cfg=  new Configuration();
		     cfg.configure("hibernate.cfg.xml");
		     SessionFactory factory = cfg.buildSessionFactory();
		     
		     //creating object and set values
		     
		     Session session =factory.openSession();
		     org.hibernate.Transaction tx=session.beginTransaction();
		     
		 	 Book_Details bd=new Book_Details();
		 	 bd.setId(20);
		 	 bd.setPrice(100);
		 	 bd.setAuthor("harry");
		     
		 	 session.save(bd);
		 	 tx.commit();
		 	 session.close();
		 	System.out.println("book record inserted successfully");
		    
		 	 factory.close();
		 	 
}


		public void readBook() {
			Configuration cfg=  new Configuration();
		     cfg.configure("hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
		    Session session =factory.openSession();
		   int j;
		     System.out.println("Enter user id u want to read");
		     j=sc.nextInt();
		     Book_Details w=session.get(Book_Details.class,j);
		     System.out.println("book Id : "+w.getId()+"   book price: "+w.getPrice()+"  book author  "+w.getAuthor());
			
		     session.close();
		     factory.close();
		} } 
