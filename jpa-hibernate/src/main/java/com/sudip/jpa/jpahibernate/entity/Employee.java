package com.sudip.jpa.jpahibernate.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Employee_type")
public abstract class Employee {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
