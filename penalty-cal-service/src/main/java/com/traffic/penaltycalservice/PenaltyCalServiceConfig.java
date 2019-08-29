package com.traffic.penaltycalservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component("penaltyCalServiceConfig")
@ConfigurationProperties("penalty-cal-service")
public class PenaltyCalServiceConfig {

	private int maxPenalty;
	private int minPenalty;
	public int getMaxPenalty() {
		return maxPenalty;
	}
	public void setMaxPenalty(int maxPenalty) {
		this.maxPenalty = maxPenalty;
	}
	public int getMinPenalty() {
		return minPenalty;
	}
	public void setMinPenalty(int minPenalty) {
		this.minPenalty = minPenalty;
	}
	
}
