package com.xcodefix.travels.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xcodefix.entity.model.User;
import com.xcodefix.travels.dao.IUserDAO;
import com.xcodefix.travels.dao.jdbctemplate.UserDao;

public class UserService {
	
	@Autowired
	private IUserDAO userDao;
	
	public User authenticate(String userName, String password) {
		User user = userDao.authendication(userName, password);
		
		return user;
	}

}
