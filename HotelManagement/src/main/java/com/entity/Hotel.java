package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int hotelId;        
private String Name;   
private String location;

public int getHotelId() {
	return hotelId;
}
public void setHotelId(int hotelId) {
	this.hotelId = hotelId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

public Hotel(int hotelId, String name, String location) {
	super();
	this.hotelId = hotelId;
	Name = name;
	this.location = location;
}


public Hotel() {
	
}
@Override
public String toString() {
	return "Hotel [hotelId=" + hotelId + ", Name=" + Name + ", location=" + location + "]";
}




	
}
