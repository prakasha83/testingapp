package com.xcodefix.travels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcodefix.entity.model.Travels;
import com.xcodefix.travels.dao.jdbctemplate.TravelsDAO;

@Service
public class TravelsService {
	
	@Autowired
	private TravelsDAO travelsDAO;
	
	public List<Travels> getAllTravels() {
		
		return travelsDAO.getAllActiveTravels();
		
	}

}
