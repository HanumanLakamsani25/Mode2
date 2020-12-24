package com.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empNo;
	private String firstName;
	private String emailId;

	public Employee() {
		super();
	}

	public Employee(int empNo, String firstName, String emailId) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.emailId = emailId;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
