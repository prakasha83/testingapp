package com.xcodefix.travels.dao;

import com.xcodefix.entity.model.User;

public interface IUserDAO {
	
	public String authendicateQuery = "SELECT id, user_name, email FROM user WHERE user_name = ? AND password  = ?";
	
	public User authendication(String userName, String password);

}
