package com.xcodefix.travels.dao.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xcodefix.entity.mapper.UserMapper;
import com.xcodefix.entity.model.User;
import com.xcodefix.travels.dao.IRoleDAO;
import com.xcodefix.travels.dao.IUserDAO;


@Repository
@Transactional
public class UserDao implements IUserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private IRoleDAO roleDAO;
	
	@Override
	public User authendication(String userName, String password) {
	
		List<User> user = jdbcTemplate.query(authendicateQuery, new Object[] {userName, password}, new UserMapper());
		
		if (user.size() > 0) {
			
			user.get(0).setRoles(roleDAO.getRoleByIds(user.get(0).getId()));
			
			return user.get(0);
			
		} else {
			
			return null;
			
		}
		
	}

}
