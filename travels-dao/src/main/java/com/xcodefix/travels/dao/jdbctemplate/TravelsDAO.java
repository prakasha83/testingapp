package com.xcodefix.travels.dao.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xcodefix.entity.mapper.TravelsMapper;
import com.xcodefix.entity.model.Travels;
import com.xcodefix.travels.dao.ITravelsDAO;

@Repository
@Transactional
public class TravelsDAO implements ITravelsDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Travels> getAllActiveTravels() {
		
		return jdbcTemplate.query(allActiveTravels, new TravelsMapper());
		
	}

}
       