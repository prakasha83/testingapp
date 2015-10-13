package com.xcodefix.travels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcodefix.entity.model.Customer;
import com.xcodefix.travels.dao.jdbctemplate.CustomerDAO;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;
	
	public List<Customer> getAllCustomers() {
		
		return customerDao.getAllCustomers();
		
	}

}
