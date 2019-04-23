package com.sudip.mircoservices.currencycalculationservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyCalculationServiceController {
	
	@Autowired
	private CurrencyCalculationServiceUsingFeignClient proxy;
	
	/**
	 * This is the old style to use ResponseEntity and RestTemplate
	 * @param from
	 * @param to
	 * @param quantity
	 * @return
	 */

	@GetMapping("/calculateCurrency/from/{from}/to/{to}/quantity/{quantity}")
	public CalculatedCurrencyDetail calculateCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {

		// Call currency exchange service and get the values using responsEntity
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

		ResponseEntity<CalculatedCurrencyDetail> response = new RestTemplate().getForEntity(
				"http://localhost:8001/getExchangeRate/from/{from}/to/{to}", CalculatedCurrencyDetail.class,
				uriVariables);
		CalculatedCurrencyDetail responseBody = response.getBody();

		return new CalculatedCurrencyDetail(responseBody.getId(), from, to,
				responseBody.getExchangeRate(), quantity,
				quantity * responseBody.getExchangeRate(),responseBody.getPort());
	}
	
	/**
	 * New way to use FiegnClient to call rest services
	 */
	
	@GetMapping("/calculateCurrencyFeign/from/{from}/to/{to}/quantity/{quantity}")
	public CalculatedCurrencyDetail calculateCurrencyFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {

		CalculatedCurrencyDetail responseBody = proxy.calculateCurrencyUsingFeign(from, to);

		return new CalculatedCurrencyDetail(responseBody.getId(), from, to,
				responseBody.getExchangeRate(), quantity,
				quantity * responseBody.getExchangeRate(),responseBody.getPort());
	}
}
