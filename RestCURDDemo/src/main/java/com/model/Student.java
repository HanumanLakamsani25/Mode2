package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;	
	@Column(name = "student_name", nullable = false, length = 50)
	private String studentName;
	
	@Column(name="student_branch",nullable=false,length=50)
	private String studentBranch;
	
	@Column(name=" college_name",nullable=false,length=50)
	private String collegeName;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentBranch, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.collegeName = collegeName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
}
