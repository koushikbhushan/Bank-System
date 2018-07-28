package com.casestudy.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.bank.model.Account;
import com.casestudy.bank.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(name="/account", method=RequestMethod.POST)
	public String createAccount(@RequestBody Account account) {
		
		return "Success";
	}
	
	@RequestMapping(name="/account/{accountNumber}", method=RequestMethod.GET)
	public Account getAccount(@PathVariable String accountNumber) {
		Account a = new Account();
		return a;
	}
}
