package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public Student getStudent(int studentId) {
		Student student = null;
		if (studentId == 1) {
			student = new Student(1, "KaneWilliamson", 99.9f);
		}
		if (studentId == 2) {
			student = new Student(2, "David Warner", 98.9f);
		}
		return student;
	}
}
