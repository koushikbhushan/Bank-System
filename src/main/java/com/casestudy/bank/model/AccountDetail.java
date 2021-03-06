package com.casestudy.bank.model;

import org.springframework.data.annotation.Id;

/**
 * This class contains basic account detail
 * @author Koushik
 *
 */
public class AccountDetail {
	@Id
	private String accountNumber;
	private String ifsc;
	
	public AccountDetail() {
		super();
	}
	public AccountDetail(String accountNumber, String ifsc) {
		super();
		this.accountNumber = accountNumber;
		this.ifsc = ifsc;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	
}
