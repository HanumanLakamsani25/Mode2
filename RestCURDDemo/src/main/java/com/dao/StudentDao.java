package com.dao;

import com.model.Student;

public interface StudentDao {

	public Student createStudent(Student student);
	public Student getStudent(int studentId);
	public Student updateStudent(Student student);
	public int deleteStudent(int studentId);

}
