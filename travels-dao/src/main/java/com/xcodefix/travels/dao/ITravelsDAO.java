package com.xcodefix.travels.dao;

import java.util.List;

import com.xcodefix.entity.model.Travels;
import com.xcodefix.entity.model.TravelsGroup;

public interface ITravelsDAO {
	
	public String allActiveTravels = "select id, travels_name, contact_person from travels";
	public String allActiveTravelsGroup = "select id, group_name from travels_group";
	public String insertTravels = "INSERT INTO travels (travels_name, contact_person) VALUES (? , ?)";
	
	public List<Travels> getAllActiveTravels();
	public List<TravelsGroup> getAllActiveTravelsGroup();
	public void addTravels(Travels travels);

}
