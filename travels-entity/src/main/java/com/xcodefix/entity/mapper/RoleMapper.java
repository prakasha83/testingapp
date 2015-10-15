package com.xcodefix.entity.mapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.xcodefix.entity.model.Role;
import com.xcodefix.entity.model.User;

public class RoleMapper implements RowMapper<Role> {

	@Override
	public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ResultSetMetaData metaData = rs.getMetaData();
		
		int columnNumber = metaData.getColumnCount();
		
		Role role = new Role();
		
		for (int  i = 1; i <= columnNumber; i++) {
			
			if ( metaData.getColumnName(i).equals("id") ) {
				
				role.setId(rs.getLong("id"));
				
			} else if (metaData.getColumnName(i).equals("role_name")) {
				
				role.setRoleName(rs.getString("role_name"));
				
			}
			
		}
		
		return role;
		
	}

}
