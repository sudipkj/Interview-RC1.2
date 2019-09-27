package com.sudip.design.patterns;

public final class StudentData {

	public StudentData(int courseId, String courseName, Student student) {

		super();
		this.courseId = courseId;
		this.courseName = courseName;
		
		// 2. Deep cloning
		Student clone = new Student();
		clone.setStudentId(student.getStudentId());
		clone.setStudentName(student.getStudentName());

		this.student = clone;
	}
	// 1. All Fields should be marked private and final

	private final int courseId;
	private final String courseName;
	private final Student student;
	
	// Only getters
	public int getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public Student getStudent() {
		Student s = new Student();
		s.setStudentId(student.getStudentId());
		s.setStudentName(student.getStudentName());
		return s;
	}

	

}
