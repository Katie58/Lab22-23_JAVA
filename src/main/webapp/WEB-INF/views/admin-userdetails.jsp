<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../style.css">
<title>${user.name}'s details</title>
</head>
<body>
	<div class="background" id="background-image">
	<form>
		<div class="cowboy1">${user.name}</div>
		<fieldset class="left"></fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;User details</strong><br><hr>
			<p><div class="form-left">Name:</div><div class="form-right">${user.firstname} ${user.lastname}</div></p>
			<p><div class="form-left">Email:</div><div class="form-right">${user.email}</div></p>
			<p><div class="form-left">Age:</div><div class="form-right">${user.age}"</div></p>
			<p><div class="form-left">Password:</div><div class="form-right">${user.password}"</div></p>
		</fieldset>
		<fieldset class="right"></fieldset>
		<a class="left" id="left" style="width:30% bottom:5%" href="/admin/user/${user.id}/edit">Edit</a>
		<a class="center" id="center" style="width:30% bottom:5%" href="/admin/user/${user.id}/delete">Delete</a>
		<a class="right" id="right" style="width:30% bottom:5%" href="/admin/users">Back to Users</a>
	</form>
	</div>
</body>
</html>