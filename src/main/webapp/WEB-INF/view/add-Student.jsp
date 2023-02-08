<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>

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

	<div class="bod" class="container" >
		<h2>Add Student</h2>
		<form:form action="save-student" modelAttribute="student"
			method="POST">

			<form:hidden path="id" />

			<label class="form-label">Name :</label>
			<form:input path="name" class="form-control" id="exampleFormControlInput1" />
			<br>
			<br>
			<label class="form-label">Mobile :</label>
			<form:input path="mobile"  class="form-control" id="exampleFormControlInput1"/>
			<br>
			<br>
			<label class="form-label">Country :</label>
			<form:input path="country" class="form-control" id="exampleFormControlInput1" />
			<br>
			<br>
			<input type="submit" value="Submit" class="btn btn-primary">
		</form:form>
	</div>
</body>
</html>