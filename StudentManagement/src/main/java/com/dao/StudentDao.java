package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Student;

public class StudentDao {
	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student b = new Student();
		
	
	}



public void UpdateData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Student.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	String hqlQuery = "update Student set address=:address where id=:myid ";
	MutationQuery query = ss.createMutationQuery(hqlQuery);
	query.setParameter("address", "chh.Sambhajinagar");
	query.setParameter("myid", 1);
	query.executeUpdate();

	System.out.println("Data is Updated...");

	tr.commit();
	ss.close();
	
}


public void DeleteData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Student.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	String hqlQuery = "delete from Student where id=:myid";
	 MutationQuery query= ss.createMutationQuery("hqlQuery");
	query.setParameter("myid", 1);
	query.executeUpdate();

	System.out.println("Data is Deleted...");

	tr.commit();
	ss.close();
	
}

public void SingleGetData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Student.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	String hqlQuery = "from Student where stud_id=:stud_id";

	Query<Student> query = ss.createQuery(hqlQuery, Student.class);
	query.setParameter("stud_id", 1);

	Student s = query.uniqueResult();
	System.out.println(s);
	
	tr.commit();
	ss.close();
}

public void GetAllData() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Student.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	String hqlQuery = "from Student ";
	org.hibernate.query.Query<Student> query = ss.createQuery(hqlQuery, Student.class);
	List<Student> list = query.list();
	

//	Query query = ss.createQuery(hqlQuery);
//	List<Student> list = query.getResultList();

	
	for (Student student : list) {
		System.out.println(student);
	}
}




}