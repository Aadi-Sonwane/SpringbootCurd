package com.techtest.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	private int hotelid; // Create an Variable for getting hotel id 
	private String hotelname; // Taking Hotel name
	
	public int getHotelid() { // get method 
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname =hotelname;
	}
	
}
