package com.traffic.control.penaltycalculationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traffic.control.penaltycalculationservice.config.PenaltyCalculationServiceConfig;

@RestController
public class PenaltyCaculationServiceController {

	@Autowired
	private PenaltyCalculationServiceConfig penaltyCalculationServiceConfig;
	
	@GetMapping("/calculatePenalty")
	public void calculatePenalty() {
		
		if(null != penaltyCalculationServiceConfig) {
			System.out.println("Value is " + penaltyCalculationServiceConfig.getMinPenalty());	
		}else {
			System.out.println("config is null");
		}
		
	}
}
