package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
public class FirstController 
{
    @Autowired
	private StudentService studentService;
	@RequestMapping(value = "/")
	public String sayHello() {
		return "Welcome Buddy..!!!";
	}

	@GetMapping(value = "/getstudent/{student}")
	public Student getStudent( @PathVariable ("student") int userData) {
		return studentService.getStudent(userData);
	}
	
	@PostMapping(value="/create")
	public Student  createStudent(@RequestBody Student student)
	{
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getMarks());
		return student;
	}
	
	@DeleteMapping(value = "/deletestudent/{student}")
	public Student deleteStudent( @PathVariable ("student") int userData) {
		return studentService.getStudent(userData);
	}
	@PutMapping(value="/update")
	public Student  updateStudent(@RequestBody Student student)
	{
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getMarks());
		return student;
	}
	
	
}
