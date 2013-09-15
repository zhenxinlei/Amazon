package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserRoleService {
	@Autowired
	private UserRoleDao userRoelDao;
	
	public void addUser(UserRole userRole){
		userRoelDao.addUser(userRole);
	}
	
	public void deletUser(UserRole userRole){
		userRoelDao.deletUser(userRole);
	}
	
	public void updateUser(UserRole userRole){
		userRoelDao.updateUser(userRole);
	}
	
	public void findUser(UserRole userRole){
		userRoelDao.findUser(userRole);
	}
}
