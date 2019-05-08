package com.sudip.jpa.jpahibernate.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sudip.jpa.jpahibernate.entity.Course;

@Repository
@Transactional
public class CourseRepository {

	@PersistenceContext
	EntityManager em;

	public Course findCourseById(int id) {
		return em.find(Course.class, id);
	}

	// public List<Course> findAllCourses(){
	// return em.createQuery("select * from Course",)
	// }

	public int deleteCourseById(int id) {
		Course course = em.find(Course.class, id);

		if (course == null) {
			throw new IllegalArgumentException("Course Not found for " + id);
		}
		em.remove(course);
		return course.getId();
	}

	public Course addNewCourse(Course course) {

		if (course.getId() == 0) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		return course;
	}

	public void playWithEntityManager() {
		Course c1 = new Course("Angular Js");
		em.persist(c1);

		Course c2 = new Course("Hibernate Js");
		em.persist(c2);

		em.flush(); // Commits all the changes done in entitymanager to DB

		Course c3 = new Course("Java 8");
		em.persist(c3);
		c3.setName("SOme dummy"); // THis will not be reflected in db as c3 is detach
		em.flush();

		Course c4 = new Course("Spring Boot");
		em.persist(c4);
		em.flush();

		c4.setName("Bandar");
		em.refresh(c4);// C4 will sync with the DB values.

		em.clear(); // vacates entity manager or persistence context

	}

	public List<Course> getAllCourses() {

		TypedQuery<Course> courseList = em.createQuery("SELECT c FROM Course c where c.name like '%Information%'", Course.class);
		List<Course> cl = courseList.getResultList();
		return cl;

	}
	public List<Course> getAllCourseNames(){
		Query query = em.createNamedQuery("query_get_all_courses", Course.class);
		List<Course> list= query.getResultList();
		return list;
	}
	
	public String getTotalNoOfCourses() {
		Query query = em.createNativeQuery("SELECT * FROM COURSE where id=:id",Course.class);
		query.setParameter("id", 2);
		List<Course> course = query.getResultList();
		String result = course.get(0).getName();
		
		return result;
	}

}
