package com.casestudy.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.bank.model.Account;
import com.casestudy.bank.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository;
	
	public Account getAccount(String accountNumber) {
		return accountRepository.findByAccountNumber(accountNumber);
	}
	
	public boolean createAccount(Account account) {
		accountRepository.save(account);
		
		return true;
	}
	
}
