package com.casestudy.bank.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This class contains users detail and account information
 * @author Koushik
 *
 */
@Document
public class User {
	@Id
	private int userId;
	private String name;
	@DBRef
	private Set<Account> accounts;
	private Set<Beneficiary> beneficiaries;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	public void addAccounts(Account account) {
		if(this.accounts == null) {
			this.accounts = new HashSet<>();
		}
		this.accounts.add(account);
	}
	
	public Set<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}
	public void setBeneficiaries(Set<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	
	
}
