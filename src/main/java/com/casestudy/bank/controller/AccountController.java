package com.casestudy.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.bank.model.Account;
import com.casestudy.bank.model.User;
import com.casestudy.bank.service.AccountService;
import com.casestudy.bank.service.UserService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(name="/account", method=RequestMethod.POST)
	public String createAccount(@RequestBody Account account) {
		accountService.createAccount(account);
		try {
			User user = userService.getUser(account.getUser().getUserId());
			user.addAccounts(account);
			userService.updateUser(user);
		} catch (NullPointerException e) {
			return "User data not found";
		}
		return "Success";
	}
	
	@RequestMapping(name="/account/{accountNumber}")
	public Account getAccount(@RequestParam("accountNumber") String accountNumber) {
		return accountService.getAccount(accountNumber);
	}
}
