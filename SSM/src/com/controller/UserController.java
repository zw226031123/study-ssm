package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.User;
import com.service.impl.UserServiceImpl;


@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/insUser")
	public String save(User user) {
		userServiceImpl.insUser(user);
		return "login";
	}
	@RequestMapping("/selectAll")
	public String selectAll(HttpServletRequest req) {
		List<User> list = userServiceImpl.selectUserAll();
		req.setAttribute("list", list);
		return "list";
	}
}
