package com.sudip.jpa.jpahibernate;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sudip.jpa.jpahibernate.entity.Course;
import com.sudip.jpa.jpahibernate.entity.Review;
import com.sudip.jpa.jpahibernate.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaHibernateApplication.class)
public class StudentTestClass {
	@Autowired
	EntityManager entityManager;
	
	
	//Eager Fetching of passport details
	@Test
	@Transactional
	public void getStudent() {
		
		Student student = entityManager.find(Student.class, 1L);
		System.out.println(student);
		assertNotNull(student);
		assertNotNull(student.getPassport());
	}
	
	@Test
	@Transactional
	public void getCourse() {
		Course course = entityManager.find(Course.class, 1);
		
		for (Review rev : course.getReviews()) {
			System.out.println(rev.getRate());
		}
	
	}
	
	

}
