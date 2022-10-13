package com.techtest.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtest.main.dao.HotelRpo;
import com.techtest.main.model.Hotel;
import com.techtest.main.serviceI.HotelInterface;

@Service
public class HotelImpl implements HotelInterface{
	
	@Autowired
	HotelRpo hr;
	
	@Override
	public void save(Hotel hotel) {
		
		hr.save(hotel);
	}
	
	

}
