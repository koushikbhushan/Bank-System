package com.casestudy.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.bank.model.User;
import com.casestudy.bank.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/user/{id}")
	public User getUsers(@PathVariable int id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}
