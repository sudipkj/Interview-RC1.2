package com.sudip.jpa.jpahibernate.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Passport {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique=true)
	private String passportId;
	
	@UpdateTimestamp
	private LocalDate updatedTimestamp;
	@CreationTimestamp
	private LocalDate creationTimestamp;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="passport")
	private Student student;
	
	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public Passport(String passportId) {
		super();
		this.passportId = passportId;
	}

	public Long getId() {
		return id;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public LocalDate getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(LocalDate updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	public LocalDate getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(LocalDate creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportId=" + passportId + ", updatedTimestamp=" + updatedTimestamp
				+ ", creationTimestamp=" + creationTimestamp + "]";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
