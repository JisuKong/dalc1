package com.dalc.one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dalc.one.dao.UserDAO;
import com.dalc.one.domain.User;
import com.dalc.one.service.Facade;

@Service
@Transactional
public class Impl implements Facade{

	@Autowired
	private UserDAO userDao;

	public List<User> getUserList(){
		return userDao.getUserList();
	}
}