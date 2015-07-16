package com.xcodefix.travels.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.xcodefix.entity.model.User;

public class UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public User getUser(String userName) {
		return (User)sessionFactory.getCurrentSession().createQuery("from User where userName = " + userName).uniqueResult();
	}

}
