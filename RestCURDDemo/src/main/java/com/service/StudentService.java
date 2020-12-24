package com.service;

import com.model.Student;

public interface StudentService {

	public Student createStudent(Student student);
	public Student getStudent(int studentId);
	public Student updateStudent(Student student);
	public int deleteStudent(int studentId);


}
