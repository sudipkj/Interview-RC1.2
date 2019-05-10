package com.sudip.jpa.jpahibernate.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
@Entity
public class FullTimeEmployee extends Employee {

	private BigDecimal salary;
	

	public FullTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTimeEmployee(String name, BigDecimal salary) {
		super(name);
		this.salary = salary;
	}

	public FullTimeEmployee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
