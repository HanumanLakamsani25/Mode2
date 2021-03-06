package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
	private StudentDao studentDao;
	@Override
	public Student getStudent(int studentId) {
		
		return studentDao.getStudent(studentId);
	}

}
