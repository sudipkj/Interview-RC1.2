package com.sudip.jpa.jpahibernate.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true)
	private String name;

	@UpdateTimestamp
	private LocalDate updatedTimestamp;
	@CreationTimestamp
	private LocalDate creationTimestamp;

	@OneToOne(fetch = FetchType.LAZY)
	private Passport passport;

	@ManyToMany
	@JoinTable(name="Student_course", joinColumns=@JoinColumn(name="Student_id"),
	inverseJoinColumns=@JoinColumn(name="Course_id"))
	private List<Course> courses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
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

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", updatedTimestamp=" + updatedTimestamp
				+ ", creationTimestamp=" + creationTimestamp + ", passport=" + passport + "]";
	}

}
