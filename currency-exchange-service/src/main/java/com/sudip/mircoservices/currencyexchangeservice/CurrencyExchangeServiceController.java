package com.sudip.mircoservices.currencyexchangeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sudip.mircoservices.ccuexcservice.feignclients.JPAHibernateClient;
import com.sudip.mircoservices.currencyexchangeservice.bean.Currency;
import com.sudip.mircoservices.currencyexchangeservice.bean.ExchangeRateDetails;

@RestController
public class CurrencyExchangeServiceController {
	
	//from/USD/to/INR
	@Autowired
	private Environment enviroment;
	@Autowired
	CurrencyExchangeServiceConfiguration currencyExchangeServiceConfiguration;
	
	@Autowired
	JPAHibernateClient proxy;
	
	
	@GetMapping("/getExchangeRate/from/{from}/to/{to}")
	public ExchangeRateDetails getExchangeRate(@PathVariable String from, @PathVariable String to) {
		int port = Integer.parseInt(enviroment.getProperty("local.server.port"));
		return new ExchangeRateDetails(100L,from,to,currencyExchangeServiceConfiguration.getExchangeRate(), port);
	}
	
	@GetMapping("/getAllCurrencies")
	public List<Currency> getAllCurrencies(){
		return proxy.getAllAvailableCCU();
	}
}
