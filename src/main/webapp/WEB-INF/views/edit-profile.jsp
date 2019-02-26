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
<div class="background" id="background-image">
	<%@include file="partials/header.jsp" %>
	<div class="cowboy1"><br>Profile</div>
	<form action="/edit-profile" onsubmit="return validateForm()" method="post">
		<fieldset class="left">			
		</fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;PLEASE FILL THE FORM BELOW</strong><br><hr id="move-right">
			<p><div class="form-left">First Name:</div><div class="form-right"><input name="firstname" value="${user.firstname}" required/></div></p>
			<p><div class="form-left">Last Name:</div><div class="form-right"><input name="lastname" value="${user.lastname}" required/></div></p>
			<p><div class="form-left">Email:</div><div class="form-right"><input name="email" value="abc@easyAs.123" type="email" /></div></p>
			<p><div class="form-left">Age:</div><div class="form-right"><input name="age" value="25" type="number" min="1" max="120" /></div></p>
			<p><div class="form-left">Password:</div><div class="form-right"><input name="password" value="nunya" type="password" /></div></p>
			<button class="cowboy2" id="submit" type="submit">submit</button>
		</fieldset>
		<fieldset class="right">				
		</fieldset>
	</form>
	<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>