package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public Student createStudent(Student student) {
		return studentDao.createStudent(student);
	}

	@Transactional
	public Student getStudent(int studentId) {
	  
		return studentDao.getStudent(studentId) ;
	}

	@Transactional
	public Student updateStudent(Student student) {

		return studentDao.updateStudent(student);
	}
	
	@Transactional
	public int deleteStudent(int studentId) {

		return studentDao.deleteStudent(studentId);
	}

}
