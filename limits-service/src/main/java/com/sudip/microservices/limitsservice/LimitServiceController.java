package com.sudip.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudip.configuration.LimitsServiceConfiguration;
import com.sudip.microservices.limitsservice.bean.LimitsServiceBean;

@RestController
public class LimitServiceController {
	
	@Autowired
	private LimitsServiceConfiguration limitsServiceConfiguration;

	@GetMapping("/limits")
	public LimitsServiceBean  getLimitServiceConfiguration() {
		return new LimitsServiceBean(limitsServiceConfiguration.getMinimum(), limitsServiceConfiguration.getMaximum());
	}
	
}
