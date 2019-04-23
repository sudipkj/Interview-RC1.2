package com.sudip.mircoservices.currencycalculationservice;

public class CalculatedCurrencyDetail {
	private long id;
	private String from;
	private String to;
	private int exchangeRate;
	private long quantity;
	private long totalAmount;
	private int port;

	

	public CalculatedCurrencyDetail(long id, String from, String to, int exchangeRate, long quantity, long totalAmount,
			int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
	}

	public CalculatedCurrencyDetail() {
		super();
	}

	public CalculatedCurrencyDetail(long id, String from, String to, int exchangeRate, long quantity,
			long totalAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
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

	public int getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(int exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
