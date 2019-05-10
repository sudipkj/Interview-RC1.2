package com.sudip.jpa.jpahibernate.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee {
	
	private BigDecimal dailyWage;
	
	
	public PartTimeEmployee(String name, BigDecimal dailyWage) {
		super(name);
		this.dailyWage = dailyWage;
	}
	
	public PartTimeEmployee() {
	}

	public BigDecimal getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(BigDecimal dailyWage) {
		this.dailyWage = dailyWage;
	}

	
	
	
}
