package com.xcodefix.travels.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xcodefix.entity.model.User;
import com.xcodefix.travels.dao.UserDao;

public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean authenticate(String userName) {
		User user = userDao.getUser(userName);
		
		if (user == null) {
			return false;
		}
		
		return true;
	}

}
