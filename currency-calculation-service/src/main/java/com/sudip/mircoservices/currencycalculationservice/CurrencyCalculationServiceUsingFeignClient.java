package com.sudip.mircoservices.currencycalculationservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyCalculationServiceUsingFeignClient {
	
	@GetMapping("/getExchangeRate/from/{from}/to/{to}")
	public CalculatedCurrencyDetail calculateCurrencyUsingFeign(@PathVariable("from") String from, @PathVariable("to") String to);
}
