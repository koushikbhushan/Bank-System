package com.casestudy.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.bank.model.User;

@RestController
public class UserController {
	
	@RequestMapping("/users")
	public User getUsers() {
		String userName = "Koushik";
		User user = new User();
		user.setName(userName);
		return user;
	}
}
