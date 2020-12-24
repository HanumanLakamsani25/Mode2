package com.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployeeById(int empId) {
		EmployeeDao employeedao = new EmployeeDaoImpl();
		return employeedao.getEmployeeById(empId);
	}

}
