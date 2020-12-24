package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("createstudent")
	public Student createStudent(@RequestBody Student student)
	{
		return studentService.createStudent(student);
	}
	
	@GetMapping("getstudent/{studentid}")
	public Student getStudent(@PathVariable("studentid") int StudentId)
	{
		return studentService.getStudent(StudentId);
	}
	
	@PutMapping("updatestudent")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("deleteStudent/{studentid}")
	public String deleteStudent(@PathVariable("studentid")int studentId)
	{
		if(studentService.deleteStudent(studentId)==1)
		{
			return "Sucessfully Deleted";
		}
		else
		{
			return "Delete operation failed";
		}
	}
}

