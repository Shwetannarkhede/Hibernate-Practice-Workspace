package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hotel;

public class HotelDao {
	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hotel.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Hotel h = new Hotel();
		
		h.setName("lemonTree");
		h.setLocation("chh.sambhajinagar");
		ss.persist(h);

		System.out.println("Data is inserted...");

		tr.commit();
		ss.close();

	}



public void UpdateData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Hotel.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	int hotelId = 1;
	Hotel h = ss.get(Hotel.class, hotelId);
	
	
	h.setName("Rama International");
	ss.merge(h);

	System.out.println("Data is Updated...");

	tr.commit();
	ss.close();
	
}


public void DeleteData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Hotel.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

  int hotelId=1;
Hotel h = ss.get( Hotel.class,hotelId);


   ss.remove(h);

	System.out.println("Data is Deleted...");

	tr.commit();
	ss.close();
	
}

public void SingleGetData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Hotel.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	int hotelId = 2;
	Hotel h = ss.get(Hotel.class, hotelId);
	System.out.println(h);

	tr.commit();
	ss.close();
}



}