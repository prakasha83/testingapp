package com.xcodefix.travels.dao;

import com.xcodefix.entity.model.User;

public interface IUserDAO {
	
	public String authendicateQuery = "SELECT id, username, email, travels_group_id, "
			+ "travels_group_lock, travels_lock FROM user WHERE username = ? AND password  = ?";
	
	public User authendication(String userName, String password);

}
