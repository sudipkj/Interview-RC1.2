package com.sudip.mircoservices.currencyexchangeservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("currency-exchange-service")
public class CurrencyExchangeServiceConfiguration {
	private int exchangeRate;

	public int getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(int exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}
