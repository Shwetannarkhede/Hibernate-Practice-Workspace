package com.service;

import com.dao.StudentDao;

public class StudentService {
	public void insertData() {
		StudentDao student = new StudentDao();
		student.insertData();
	}
	

	public void updateData() {
		StudentDao student = new StudentDao();
		student.UpdateData();
	}
	
	public void DeleteData() {
		StudentDao student = new StudentDao();
		student.DeleteData();
	}
	public void SingleGetData() {
		StudentDao student=new StudentDao();
		student.SingleGetData();
	}
	
	public void GetAllData() {
		StudentDao student=new StudentDao();
		student.GetAllData();
	}
	
}
