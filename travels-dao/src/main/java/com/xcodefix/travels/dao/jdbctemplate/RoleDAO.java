package com.xcodefix.travels.dao.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xcodefix.entity.mapper.RoleMapper;
import com.xcodefix.entity.model.Role;
import com.xcodefix.travels.dao.IRoleDAO;

@Repository
@Transactional
public class RoleDAO implements IRoleDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Role> getRoleByIds(long userId) {
		
		return jdbcTemplate.query(roleByUser+userId, new RoleMapper());
		
	}

}
