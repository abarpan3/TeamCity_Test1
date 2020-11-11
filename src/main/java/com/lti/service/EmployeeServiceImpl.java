package com.lti.service;

import java.util.List;

import com.lti.dao.EmployeeDaoImpl;
import com.lti.model.Employee;

public class EmployeeServiceImpl {
	EmployeeDaoImpl dao = new EmployeeDaoImpl();
	
	public boolean addEmployee(Employee employee) {
		boolean result = dao.createEmployee(employee);
		return result;
	}
	
	public List<Employee> findAllEmployees(){
		List<Employee> list = dao.getEmployees();
		return list;
	}
}
