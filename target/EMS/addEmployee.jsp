<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h2>Add Employee Form</h2>
	<form method="post" action="addEmployee.do">
		Employee Id <input type="text" name="employeeId"><br>
		Employee Name <input type="text" name="employeeName"><br>
		Employee Salary <input type="text" name="employeeSalary"><br>
		<input type="submit" value="Add Employee">
	</form>
</body>
</html>