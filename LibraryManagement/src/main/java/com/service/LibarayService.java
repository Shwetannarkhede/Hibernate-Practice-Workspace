package com.service;

import com.dao.LibarayDao;

public class LibarayService {
	public void insertData() {
		LibarayDao lib = new LibarayDao();
		lib.insertData();
	}
	

	public void updateData() {
		LibarayDao lib = new LibarayDao();
		lib.UpdateData();
	}
	
	public void DeleteData() {
		LibarayDao lib = new LibarayDao();
		lib.DeleteData();
	}
	public void SingleGetData() {
		LibarayDao lib=new LibarayDao();
		lib.SingleGetData();
	}
	
}
