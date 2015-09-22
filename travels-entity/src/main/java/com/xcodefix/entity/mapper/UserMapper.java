package com.xcodefix.entity.mapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.xcodefix.entity.model.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ResultSetMetaData metaData = rs.getMetaData();
		
		int columnNumber = metaData.getColumnCount();
		
		User user = new User();
		
		for (int  i = 1; i <= columnNumber; i++) {
			
			if ( metaData.getColumnName(i).equals("id") ) {
				
				user.setId(rs.getLong("id"));
				
			} else if (metaData.getColumnName(i).equals("name")) {
				
				user.setUserName(rs.getString("name"));
				
			} else if (metaData.getColumnName(i).equals("email")) {
				
				user.setEmail(rs.getString("email"));
				
			}
			
		}
		

		
		
		return user;
	}

}
