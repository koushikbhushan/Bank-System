package com.casestudy.bank.model;

import com.casestudy.bank.intf.AccountIntf;

public class SavingsAccount extends Account implements AccountIntf {
	String check;

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}
	
	
}
