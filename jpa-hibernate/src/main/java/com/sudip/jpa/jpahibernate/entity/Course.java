package com.sudip.jpa.jpahibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedNativeQueries(value = {
		@NamedNativeQuery(name= "native_query_get_count", query="SELECT * FROM COURSE where id=:id")
})
@NamedQueries(value = {
		@NamedQuery(name="query_get_all_courses", query="Select c from Course c")
})
public class Course {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	
	// Default no arg constructor is mandatory
	public Course() {
		super();
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
}
