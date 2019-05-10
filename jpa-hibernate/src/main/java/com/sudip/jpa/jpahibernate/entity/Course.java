package com.sudip.jpa.jpahibernate.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

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
	
	@OneToMany(mappedBy="course")
	private List<Review> reviews;
	
	@ManyToMany(mappedBy="courses")
	private List<Student> students;
	
	
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

	public List<Review> getReviews() {
		return reviews;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	
}
