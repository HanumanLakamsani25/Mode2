package com;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeApp {

	public Employee getEmployeeById(int empId) {
		EmployeeService employeeservice = new EmployeeServiceImpl();
		return employeeservice.getEmployeeById(empId);

	}
}
