package com.techtest.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techtest.main.model.Hotel;

@Repository
public interface HotelRpo extends CrudRepository<Hotel, Integer>{
	
}
