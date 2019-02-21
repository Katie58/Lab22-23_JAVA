<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../style.css">
<title>add item</title>
</head>
<body>
	<div class="background" id="background-image">
		<div class="cowboy1">javaBeanShop</div>
		<form action="/admin/user/add" onsubmit="return validateForm()" method="post">
		<fieldset class="left"></fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;Add a User</strong><br><hr>
			<p><div class="form-left">First Name:</div><div class="form-right"><input name="firstname" pattern="[A-Z]{1}[A-z]{0,30}" required/></div></p>
			<p><div class="form-left">Last Name:</div><div class="form-right"><input name="lastname" pattern="[A-Z]{1}[A-z]{0,30}" required/></div></p>
			<p><div class="form-left">Email:</div><div class="form-right"><input name="email" type="email" required/></div></p>
			<p><div class="form-left">Age:</div><div class="form-right"><input name="age" type="number" min="1" max="120" required/></div></p>
			<p><div class="form-left">Password:</div><div class="form-right"><input name="password" type="password" required/></div></p>
			<button id="submit" type="submit"></button>
		</fieldset>
		<fieldset class="right">
		<button id="clickbox-small" type="submit" href="/admin/user/add"><div class="cowboy3">ADD</div></button>
		<a href="/admin/users">Cancel</a>
		</fieldset>
		</form>
	</div>
</body>
</html>