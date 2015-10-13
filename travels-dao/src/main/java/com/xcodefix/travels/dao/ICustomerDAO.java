package com.xcodefix.travels.dao;

import java.util.List;

import com.xcodefix.entity.model.Customer;

public interface ICustomerDAO {
	
	public String allCustomerQuery = "SELECT ID, CUSTOMER_NAME, CONTACT_NO FROM CUSTOMER";
	
	public List<Customer> getAllCustomers();

}
