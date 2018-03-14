package net.xinqushi.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.xinqushi.dao.UserDAO;
import net.xinqushi.model.User;
import net.xinqushi.service.UserService;

@Service(value="service")
public class UserServiceImpl implements UserService {
	
	@Resource
	UserDAO dao;
	
	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
		dao.save(user);;
	}

}
