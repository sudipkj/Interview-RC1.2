package com.sudip.mircoservices.currencyexchangeservice.bean;

import java.time.LocalDateTime;

public class Currency {
	
	private Long id;
	
	private String Currency;
	
	private LocalDateTime updatedTimestamp;
	private LocalDateTime creationTimestamp;
	
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Currency(String currency, LocalDateTime updatedTimestamp, LocalDateTime creationTimestamp) {
		super();
		Currency = currency;
		this.updatedTimestamp = updatedTimestamp;
		this.creationTimestamp = creationTimestamp;
	}

	public Long getId() {
		return id;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public LocalDateTime getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(LocalDateTime updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	public LocalDateTime getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(LocalDateTime creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}
	
	
	

}
