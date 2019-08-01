package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;
import service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	@RequestMapping("insUser")
	public String insUser(User user) {
		int result = userServiceImpl.insUser(user);
		if(result>0) {
			return "success";
		}
		return "error";
	}
}
