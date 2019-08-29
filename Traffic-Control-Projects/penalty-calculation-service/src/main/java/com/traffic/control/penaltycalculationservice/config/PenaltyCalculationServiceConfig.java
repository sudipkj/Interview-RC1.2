package com.traffic.control.penaltycalculationservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component("penaltyCalculationServiceConfig")
@ConfigurationProperties("penalty-calculation-config")
public class PenaltyCalculationServiceConfig {
	
	private int maxPenalty;
	private int minPenalty;
	
	public int getMinPenalty() {
		return minPenalty;
	}
	public void setMinPenalty(int minPenalty) {
		this.minPenalty = minPenalty;
	}
	public int getMaxPenalty() {
		return maxPenalty;
	}
	public void setMaxPenalty(int maxPenalty) {
		this.maxPenalty = maxPenalty;
	}

}
