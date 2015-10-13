package com.xcodefix.travels.dao.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xcodefix.entity.mapper.CustomerMapper;
import com.xcodefix.entity.model.Customer;
import com.xcodefix.travels.dao.ICustomerDAO;

@Repository
public class CustomerDAO implements ICustomerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Customer> getAllCustomers() {
		
		return jdbcTemplate.query(allCustomerQuery, new CustomerMapper());
		
	}

}
