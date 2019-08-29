package com.traffic.penaltycalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.traffic")
public class PenaltyCalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PenaltyCalServiceApplication.class, args);
	}

}
