package com.service;

import com.dao.HotelDao;

public class HotelService {
	public void insertData() {
		HotelDao ed = new HotelDao();
		ed.insertData();
	}
	

	public void updateData() {
		HotelDao ed = new HotelDao();
		ed.UpdateData();
	}
	
	public void DeleteData() {
		HotelDao ed = new HotelDao();
		ed.DeleteData();
	}
	public void SingleGetData() {
		HotelDao ed=new HotelDao();
		ed.SingleGetData();
	}
	
}
