package com.sudip.jpa.jpahibernate.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Currency {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="CURENCY_VALUE", nullable=false, insertable=true,updatable=true,unique=true)
	private String Currency;
	
	@UpdateTimestamp
	private LocalDateTime updatedTimestamp;
	@CreationTimestamp
	private LocalDateTime creationTimestamp;
	
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Currency(String currency, LocalDateTime updatedTimestamp, LocalDateTime creationTimestamp) {
		super();
		Currency = currency;
		this.updatedTimestamp = updatedTimestamp;
		this.creationTimestamp = creationTimestamp;
	}

	public Long getId() {
		return id;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public LocalDateTime getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(LocalDateTime updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	public LocalDateTime getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(LocalDateTime creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}
	
	
	

}
