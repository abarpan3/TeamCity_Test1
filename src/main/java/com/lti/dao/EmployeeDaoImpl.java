package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Employee;

public class EmployeeDaoImpl {
	// in-memory database
	private static List<Employee> empdb = new ArrayList<>();
	
	public boolean createEmployee(Employee employee) {
		return empdb.add(employee);
	}
	public List<Employee> getEmployees(){
		return empdb;
	}
}
