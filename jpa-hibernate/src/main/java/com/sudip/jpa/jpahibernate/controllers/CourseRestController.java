package com.sudip.jpa.jpahibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sudip.jpa.jpahibernate.entity.Course;
import com.sudip.jpa.jpahibernate.repository.CourseRepository;

@RestController
public class CourseRestController {

	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/getCourseById/{id}")
	public Course getCourseById(@PathVariable int id) {
		Course course = courseRepository.findCourseById(id);
		System.out.println(course);
		return course;
	}
	
	@DeleteMapping("/deleteCourseById/{id}")
	public String getDeleteById(@PathVariable int id){
		return "Deleted Course for Id " + courseRepository.deleteCourseById(id);
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		course = courseRepository.addNewCourse(course);
		return course;
	}
	@GetMapping("/playWithEntityManager")
	public void playWithEntityManager() {
		courseRepository.playWithEntityManager();
	}
	
	// Find all courses from respo
	
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses(){
		return courseRepository.getAllCourses();
	}
}
