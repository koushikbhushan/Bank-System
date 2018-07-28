package com.casestudy.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.bank.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(name="/account", method=RequestMethod.GET)
	public String createAccount() {
		
		return "Success";
	}
	
	@RequestMapping(name="/account/{id}")
	public String getAccount() {
		
		return "Success";
	}
}
