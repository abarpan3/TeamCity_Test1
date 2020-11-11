package com.lti.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.Employee;
import com.lti.service.EmployeeServiceImpl;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("employeeId"));
		String empname = request.getParameter("employeeName");
		double empsal = Double.parseDouble(request.getParameter("employeeSalary"));
		
		Employee emp = new Employee(empid, empname, empsal);
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		
		boolean result = service.addEmployee(emp);
		if(result) {
			System.out.println("Employee is added.");
			// find out all the employees and print them in browser.
			List<Employee> empList = service.findAllEmployees();
			// add the data to the request
			request.setAttribute("employeeList", empList);
			
			// call the viewEmployee.jsp file
			RequestDispatcher rd = request.getRequestDispatcher("viewEmployee.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("Employee is not added.");
		}
	}

}
