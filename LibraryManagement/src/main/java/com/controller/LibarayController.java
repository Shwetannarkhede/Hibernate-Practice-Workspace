package com.controller;

import com.service.LibarayService;

public class LibarayController {
	public static void main(String[] args) {
		LibarayService libarayservice = new LibarayService();
		//libarayservice.insertData();
		//libarayservice.updateData();
		//libarayservice.DeleteData();
		libarayservice.SingleGetData();
		
		
	}

}
