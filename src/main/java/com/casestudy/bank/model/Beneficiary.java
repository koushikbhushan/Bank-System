package com.casestudy.bank.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Beneficiary extends AccountDetail {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
