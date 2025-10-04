package com.main;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Departments;
import com.entity.Employees;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Departments.class);
		cfg.addAnnotatedClass(Employees.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Departments d = new Departments();
		d.setDept_Name("Developer");
		
		Departments d1 = new Departments();
		d1.setDept_Name("HR");
		
		Departments d2 = new Departments();
		d2.setDept_Name("Manager");
		

		Employees e1 = new Employees();
		e1.setEmpid(10001);
		e1.setEmpname("shweta");
		e1.setSalary(80000);
		e1.setEmail("shweta@gmail.com");
		e1.setAddress("pune");
		e1.setDept(Arrays.asList(d, d1)); 
		


		Employees e2 = new Employees();
		e2.setEmpid(10002);
		e2.setEmpname("komal");
		e2.setSalary(50000);
		e2.setEmail("komal@gmail.com");
		e2.setAddress("pune");
		e2.setDept(Arrays.asList( d1)); 


		Employees e3 = new Employees();
		e3.setEmpid(10003);
		e3.setEmpname("chinmyee");
		e3.setSalary(90000);
		e3.setEmail("chinmyee@gmail.com");
		e3.setAddress("pune");
		e3.setDept(Arrays.asList( d2)); 


		Employees e4 = new Employees();
		e4.setEmpid(10004);
		e4.setEmpname("samarth");
		e4.setSalary(80000);
		e4.setEmail("samarth@gmail.com");
		e4.setAddress("pune");
		e4.setDept(Arrays.asList(d2)); 

		
		ArrayList<Departments> list1 = new ArrayList<Departments>();
		list1.add(d);
		list1.add(d1);
		list1.add(d2);
		
		


		ArrayList<Employees> list = new ArrayList<Employees>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		d.setEmp(list);
		d1.setEmp(list);
		d2.setEmp(list);

		ss.persist(d);
		ss.persist(d1);
		ss.persist(d2);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);
		ss.persist(e4);

		System.out.println("Data is inserted...");

		tr.commit();
		ss.close();

	}

}
