package com.sudip.mircoservices.currencyexchangeservice.bean;

public class ExchangeRateDetails {
	
	private long id;
	private String from;
	private String to;
	private long exchangeRate;
	private int port;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ExchangeRateDetails() {
		super();
	}

	public ExchangeRateDetails(long id, String from, String to, long exchangeRate, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
		this.port = port;
	}

	public ExchangeRateDetails(long id, String from, String to, long exchangeRate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public long getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(long exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	
}
