<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View-Students</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css"
	href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>
<body
	style="background-image: url('/student-management/URLToReachResourcesFolder/images/bg1.jpg'); background-size: cover;">

	<h1 align="center">
		<i>BOB THE CODER</i>
	</h1>
	<h1 align="center">Student-Management-System</h1>
	<hr>


	<div align="left" class="container">

		<form action="showAddStudentPage" >

			<input type="submit" value="ADD STUDENT" class="btn btn-primary">
			
		</form>
		<br>

		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Mobile</th>
					<th>Country</th>
					<th colspan="2">Modify</th>
				</tr>
			</thead>


			<c:forEach var="students" items="${students}">
				<tr>
					<td>${students.id}</td>
					<td>${students.name}</td>
					<td>${students.mobile}</td>
					<td>${students.country}</td>
					<td><a
						href="/student-management/updateStudent?userId=${students.id}">Update</a></td>
					<td><a
						href="/student-management/deleteStudent?userId=${students.id}"
						onclick="if(! (confirm('Are you sure you want to Delete the Student ?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>

		</table>



	</div>
</body>
</html>