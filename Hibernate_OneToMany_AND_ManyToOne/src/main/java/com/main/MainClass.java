package com.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Department d = new Department();
		d.setDept_Name("Developer");

		Employee e1 = new Employee();
		e1.setEmpid(10001);
		e1.setEmpname("shweta");
		e1.setSalary(80000);
		e1.setEmail("shweta@gmail.com");
		e1.setAddress("pune");
		e1.setDept(d);


		Employee e2 = new Employee();
		e2.setEmpid(10002);
		e2.setEmpname("komal");
		e2.setSalary(50000);
		e2.setEmail("komal@gmail.com");
		e2.setAddress("pune");
		e2.setDept(d);


		Employee e3 = new Employee();
		e3.setEmpid(10003);
		e3.setEmpname("chinmyee");
		e3.setSalary(90000);
		e3.setEmail("chinmyee@gmail.com");
		e3.setAddress("pune");
		e3.setDept(d);


		Employee e4 = new Employee();
		e4.setEmpid(10004);
		e4.setEmpname("samarth");
		e4.setSalary(80000);
		e4.setEmail("samarth@gmail.com");
		e4.setAddress("pune");
		e4.setDept(d);


		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		d.setEmp(list);

		ss.persist(d);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);
		ss.persist(e4);

		System.out.println("Data is inserted...");

		tr.commit();
		ss.close();

	}

}
