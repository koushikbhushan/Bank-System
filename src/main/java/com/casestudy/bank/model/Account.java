package com.casestudy.bank.model;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This class consists of account detail with balance information
 * @author Koushik
 *
 */
@Document
public class Account extends AccountDetail {
	private double balance;
	
	@DBRef
	Set<Transaction> transactions;
	
	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
