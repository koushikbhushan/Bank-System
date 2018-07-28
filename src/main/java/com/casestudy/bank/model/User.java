package com.casestudy.bank.model;

import java.util.Set;

/**
 * This class contains users detail and account information
 * @author Koushik
 *
 */
public class User {
	private String id;
	private String name;
	private Set<Account> accounts;
	private Set<Beneficiary> beneficiaries;
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
	public Set<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}
	public void setBeneficiaries(Set<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	
	
}
