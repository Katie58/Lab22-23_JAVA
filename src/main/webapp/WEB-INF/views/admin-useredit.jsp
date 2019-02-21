<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../style.css">
<title>${user.name} edit</title>
</head>
<body>
	<div class="background" id="background-image">
		<h1>Edit ${user.name}'s Details</h1>
		<form action="/admin/user/${user.id}/edit" onsubmit="return validateForm()" method="post">
		<fieldset class="left"></fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;User Details</strong><br><hr>
			<p><div class="form-left">Name:</div><div class="form-right"><input type="text" name="name" value="${user.firstname} ${user.lastname}" required/></div></p>
			<p><div class="form-left">Email:</div><div class="form-right"><input type="text" name="description" value="${user.email}" required/></div></p>
			<p><div class="form-left">Age:</div><div class="form-right"><input type="number" name="quantity" value="${user.age}" required/></div></p>
			<p><div class="form-left">Password:</div><div class="form-right"><input type="number" step=".01" name="price" value="${user.password}" required/></div></p>
		</fieldset>
		<button type="submit">Save Changes</button>
		<a href="/admin/user/${user.id}/">Cancel</a>
		</form>
	</div>
</body>
</html>