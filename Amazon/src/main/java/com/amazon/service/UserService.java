package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.dao.BookDao;
import com.amazon.entity.Book;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void addUser(User user){
		userDao.addUser(user);
	}
	
	public void deletUser(User user){
		userDao.deletUser(user);
	}
	
	public void updateUser(User user){
		userDao.updateUser(user);
	}
	
	public void findUser(User user){
		userDao.findUser(user);
	}

}