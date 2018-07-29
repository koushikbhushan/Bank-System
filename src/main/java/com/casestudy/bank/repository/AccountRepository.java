package com.casestudy.bank.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.bank.model.Account;

public interface AccountRepository extends MongoRepository<Account, Serializable> {
	
	 public Account findByAccountNumber(String accountNumber);

}
