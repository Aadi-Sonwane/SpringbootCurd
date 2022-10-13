package com.techtest.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techtest.main.model.Hotel;
import com.techtest.main.serviceI.HotelInterface;
@RestController
public class HomeController {

	@Autowired
	HotelInterface hi;
	
	@PostMapping("/hotellogin")
	public String savedata(@RequestBody Hotel hotel) {
		hi.save(hotel);
		return "data inseted";
		
	}
	
	
}
