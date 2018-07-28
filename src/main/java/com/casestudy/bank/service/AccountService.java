package com.casestudy.bank.service;

import org.springframework.stereotype.Service;

import com.casestudy.bank.model.Account;

@Service
public class AccountService {
	public Account getAccount(String accountNumber) {
		return new Account();
	}
	
	public boolean createAccount(Account account) {
		return true;
	}
}
