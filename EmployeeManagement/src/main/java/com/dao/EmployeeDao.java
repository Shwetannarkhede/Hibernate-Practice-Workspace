package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class EmployeeDao {
	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpname("shweta");
		e.setSalary(80000);
		e.setEmail("shweta@gmail.com");
		e.setAddress("pune");
		
		e.setEmpname("Komal");
		e.setSalary(70000);
		e.setEmail("komal@gmail.com");
		e.setAddress("pune");
		
		ss.persist(e);

		System.out.println("Data is inserted...");

		tr.commit();
		ss.close();

	}



public void UpdateData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	int empid = 1;
	Employee e = ss.get(Employee.class, empid);
	
	
	e.setAddress("chh.sambhajinagar");
	
	ss.merge(e);

	System.out.println("Data is Updated...");

	tr.commit();
	ss.close();
	
}


public void DeleteData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

  int empid=1;
Employee e = ss.get( Employee.class,empid);


   ss.remove(e);

	System.out.println("Data is Deleted...");

	tr.commit();
	ss.close();
	
}

public void SingleGetData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	int empid = 2;
	Employee e = ss.get(Employee.class, empid);
	System.out.println(e);

	tr.commit();
	ss.close();
}



}