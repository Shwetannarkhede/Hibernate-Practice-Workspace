package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {
	public void insertData() {
		EmployeeDao ed = new EmployeeDao();
		ed.insertData();
	}
	

	public void updateData() {
		EmployeeDao ed = new EmployeeDao();
		ed.UpdateData();
	}
	
	public void DeleteData() {
		EmployeeDao ed = new EmployeeDao();
		ed.DeleteData();
	}
	public void SingleGetData() {
		EmployeeDao ed=new EmployeeDao();
		ed.SingleGetData();
	}
	
}
