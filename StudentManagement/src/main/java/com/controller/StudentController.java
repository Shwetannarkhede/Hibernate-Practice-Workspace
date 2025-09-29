package com.controller;

import com.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		StudentService studentservice = new StudentService();
		//studentservice.insertData();
	//	studentservice.updateData();
		//studentservice.DeleteData();
	//studentservice.SingleGetData();
	studentservice.GetAllData();
		
		
	}

}
