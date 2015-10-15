package com.xcodefix.travels.dao;

import java.util.List;

import com.xcodefix.entity.model.Role;

public interface IRoleDAO {
	
	public String roleByUser = "SELECT r.id, r.role_name FROM roles r INNER JOIN user_roles ur ON ur.role_id=r.id where ur.user_id=";
	
	public List<Role> getRoleByIds(long userId);

}
