package com.sudip.jpa.jpahibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;
	
	@Min(1)
	@Max(5)
	private int rate;
	
	private String description;
	
	public Review(@Min(1) @Max(5) int rate, String description) {
		super();
		this.rate = rate;
		this.description = description;
	}

	@ManyToOne
	private Course course;
	

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
