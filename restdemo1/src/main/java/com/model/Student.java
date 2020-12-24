package com.model;

public class Student {

	private int studentId;
	private String studentName;
	private float marks;
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, float marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
}
