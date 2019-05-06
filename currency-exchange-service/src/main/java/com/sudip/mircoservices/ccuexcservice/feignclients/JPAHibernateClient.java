package com.sudip.mircoservices.ccuexcservice.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sudip.mircoservices.currencyexchangeservice.bean.Currency;

@FeignClient(name="jpa-hibernate", url="localhost:9001")
public interface JPAHibernateClient {
	
	@GetMapping("/getAllAvailableCCU")
	public List<Currency> getAllAvailableCCU();
	
}
