package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Book;

public class LibarayDao {
	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Book b = new Book();
		
		
	 b.setTitle("Ramayamn");
	 b.setAuthor("Valmiki");
	 
//	 b.setTitle("Mahabharata");
//	 b.setAuthor("Vaysha");
	 
		ss.persist(b);

		System.out.println("Data is inserted...");

		tr.commit();
		ss.close();

	}



public void UpdateData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Book.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	int bookId = 2;
	Book b = ss.get(Book.class, bookId);
	
	
	b.setTitle("Ramayana");
	
	ss.merge(b);

	System.out.println("Data is Updated...");

	tr.commit();
	ss.close();
	
}


public void DeleteData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Book.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

  int bookId=2;
Book b = ss.get( Book.class,bookId);


   ss.remove(b);

	System.out.println("Data is Deleted...");

	tr.commit();
	ss.close();
	
}

public void SingleGetData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Book.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	int bookId = 1;
	Book b = ss.get(Book.class, bookId);
	System.out.println(b);

	tr.commit();
	ss.close();
}



}