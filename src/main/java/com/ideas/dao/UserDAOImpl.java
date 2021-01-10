package com.ideas.dao;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ideas.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager sf;
	
	@Override
	public void addUser(User user) {
		sf.persist(user);	
	}
	
	@Override
	public User verifyUser(String email, String password) {
		User user = sf.find(User.class, email);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return user;
			} 
		} 
		return null;
	}
}
