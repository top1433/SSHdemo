package net.xinqushi.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import net.xinqushi.model.User;
import net.xinqushi.service.UserService;

@Controller
public class UserAction {
	User user;
	
	@Autowired
	UserService service;
	
	public UserService getService() {
		return service;
	}
	public void setService(UserService service) {
		this.service = service;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public String add() {
	//	System.out.println(user.name+user.pwd);
		
	    service.add(user);
		return "main";
	}
}
