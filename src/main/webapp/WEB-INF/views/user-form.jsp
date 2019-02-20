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
	<div class="register"></div>	
	<form action="/user-confirmation" onsubmit="return validateForm()" method="post">
		<fieldset class="left">			
			Join our newsletter!
			<div class="newsletter">
				<div id="left"><input type="radio" name="newsletter" value="true"><small>yes</small></div>
  				<div id="right"><input type="radio" name="newsletter" value="false"><small>no</small></div> 				
  			</div>
		</fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;PLEASE FILL THE FORM BELOW</strong><br><hr id="move-right">
			<p><div class="form-left">First Name:</div><div class="form-right"><input name="firstname" pattern="[A-Z]{1}[A-z]{0,30}" required/></div></p>
			<p><div class="form-left">Last Name:</div><div class="form-right"><input name="lastname" pattern="[A-Z]{1}[A-z]{0,30}" required/></div></p>
			<p><div class="form-left">Email:</div><div class="form-right"><input name="email" type="email" required/></div></p>
			<p><div class="form-left">Age:</div><div class="form-right"><input name="age" type="number" min="1" max="120" required/></div></p>
			<p><div class="form-left">Password:</div><div class="form-right"><input name="password" type="password" required/></div></p>
			<button id="submit" type="submit"></button>
		</fieldset>
		<fieldset class="right">

				Take our optional survey...

		</fieldset>
		<fieldset>
	</form>
	</div>
</body>
</html>