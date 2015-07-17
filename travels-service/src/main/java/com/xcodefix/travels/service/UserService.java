package com.xcodefix.travels.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xcodefix.entity.model.User;
import com.xcodefix.travels.dao.UserDao;

public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User authenticate(String userName, String password) {
		User user = userDao.getUser(userName, password);
		
		return user;
	}

}
