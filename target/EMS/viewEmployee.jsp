<%@page import="com.lti.model.Employee"%>
<%@page import="java.util.List"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS App</title>
	
</head>
<body>
	<h1>EMS Application</h1>
	<a href="addEmployee.jsp">Add New Employee</a><br>
	
	<table id="id" class="color" style="">
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
		</tr>	
		<c:if test="${ requestScope.employeeList ne null }">
			<c:forEach items="${requestScope.employeeList}" var="emp">
				<tr>
					<td> <c:out value="${ emp.employeeId }"/> </td>
					<td> <c:out value="${ emp.employeeName }"/> </td>
					<td> <c:out value="${ emp.employeeSalary }"/> </td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>

<!-- 
page directive
include directive
taglib directive
 -->
 
 <%-- 
	jsp comments
	?name=value&name2=value2	 
 --%>
 
 <!-- type = email
 type = number
 type = date -->
 
 
 