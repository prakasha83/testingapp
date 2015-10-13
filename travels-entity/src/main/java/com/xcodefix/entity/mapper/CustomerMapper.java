package com.xcodefix.entity.mapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.xcodefix.entity.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

		ResultSetMetaData metaData = rs.getMetaData();
		
		int columnNumber = metaData.getColumnCount();
		
		Customer customer = new Customer();
		
		for (int  i = 1; i <= columnNumber; i++) {
			
			if ( metaData.getColumnName(i).equals("id") ) {
				
				customer.setId(rs.getLong("id"));
				
			} else if (metaData.getColumnName(i).equals("customer_name")) {
				
				customer.setCustomerName(rs.getString("customer_name"));
				
			} else if (metaData.getColumnName(i).equals("contact_no")) {
				
				customer.setContactNo(rs.getString("contact_no"));
				
			}
			
		}
		
		return customer;
	}

}
