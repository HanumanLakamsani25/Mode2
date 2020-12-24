package com.dao;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee getEmployeeById(int empId) {
		Employee employee = null;
		if (empId == 10) {
			employee = new Employee(10, "Ten", "ten@gmail.com");
		}
		if (empId == 20) {
			employee = new Employee(20, "Twenty", "twenty@gmail.com");
		}
		return employee;
	}

}
