package com.traffic.penaltycalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PenaltyCalService {

	@Autowired
	private PenaltyCalServiceConfig penaltyCalServiceConfig;
	
	@GetMapping("/calculatePenalty")
	public void calculatePenalty() {
		System.out.println("Value is " + penaltyCalServiceConfig.getMinPenalty());
	}
}
