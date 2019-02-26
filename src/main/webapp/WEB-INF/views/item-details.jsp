<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../style.css">
<title>${item.name} details</title>
</head>
<body>
	<div class="background" id="background-image">
	<%@include file="partials/header.jsp" %>
	<div class="cowboy1"><br>${item.name}</div>
	<form>
		<fieldset class="left"></fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;Item Details</strong><br><hr>
			<p><div class="form-left">Description:</div><div class="form-right">${item.description}</div></p>
			<p><div class="form-left">Quantity:</div><div class="form-right">${item.quantity}</div></p>
			<p><div class="form-left">Price:</div><div class="form-right">$${item.price}</div></p>
		</fieldset>
		<fieldset class="right"></fieldset>
		<a class="right" id="right" style="width:30% bottom:5%" href="/javaBeanShop">Back to Shop</a>
	</form>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>