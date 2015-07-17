package com.xcodefix.travels.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xcodefix.entity.model.User;

@Repository
@Transactional
public class UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public User getUser(String userName, String password) {
		return (User)sessionFactory.getCurrentSession().
				createQuery("from User where userName='" + userName + "' and password='" + password + "'").uniqueResult();
	}

}
