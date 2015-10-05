package com.xcodefix.travels.dao;

import java.util.List;

import com.xcodefix.entity.model.Travels;

public interface ITravelsDAO {
	
	public String allActiveTravels = "select id, travels_name, contact_person from travels";
	
	public List<Travels> getAllActiveTravels();

}
