<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>Registration</title>
</head>
<body>
<div class="background">
	<div class="register"></div>
	
	<form action="/user-confirmation" onsubmit="return validateForm()" method="post">
	<table>
		<tr>
			<td>First Name:</td><td><input name="firstname" pattern="[A-Z]{1}[A-z]{0,30}" required/></td>
		</tr>
		<tr>
			<td>Last Name:</td><td><input name="lastname" pattern="[A-Z]{1}[A-z]{0,30}" required/></td>
		</tr>
		<tr>
			<td>Email:</td><td><input name="email" type="email" required/></td>
		</tr>
		<tr>
			<td>Age:</td><td><input name="age" type="number" min="1" max="120" required/></td>
		</tr>
		<tr>
			<td>Password:</td><td><input name="password" type="password" required/></td>
		</tr>
	</table>
		<p>
			<button type="submit"></button>
		</p>

	</form>
	</div>
</body>
</html>