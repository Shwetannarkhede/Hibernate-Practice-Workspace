package com.controller;

import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeService ee = new EmployeeService();
		//ee.insertData();
		//ee.updateData();
		//ee.DeleteData();
		//ee.SingleGetData();
		ee.GetAllData();
		
		
	}

}

