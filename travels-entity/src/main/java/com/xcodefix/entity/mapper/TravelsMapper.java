package com.xcodefix.entity.mapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.xcodefix.entity.model.Travels;
import com.xcodefix.entity.model.User;

public class TravelsMapper implements RowMapper<Travels> {

	@Override
	public Travels mapRow(ResultSet rs, int rowNum) throws SQLException {
		ResultSetMetaData metaData = rs.getMetaData();
		
		int columnNumber = metaData.getColumnCount();
		
		Travels travels = new Travels();
		
		for (int  i = 1; i <= columnNumber; i++) {
			
			if ( metaData.getColumnName(i).equals("id") ) {
				
				travels.setId(rs.getLong("id"));
				
			} else if (metaData.getColumnName(i).equals("travels_name")) {
				
				travels.setTravelsName(rs.getString("travels_name"));
				
			} else if (metaData.getColumnName(i).equals("contact_person")) {
				
				travels.setContactPerson(rs.getString("contact_person"));
				
			}
			
		}
		
		return travels;
	}

}
