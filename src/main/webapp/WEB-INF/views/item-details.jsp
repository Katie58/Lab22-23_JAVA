<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>${item.name} details</title>
</head>
<body>
	<div class="background" id="background-image">
		<h1>${item.name}</h1>
		<table class="table">
			<tr>
				<th scope="row">Description</th>
				<td>${item.description}</td>
			</tr>
			<tr>
				<th scope="row">Quantity</th>
				<td>${item.quantity}</td>
			</tr>
			<tr>
				<th scope="row">Price</th>
				<td>${item.price}</td>
			</tr>
		</table>
		<a class="btn btn-secondary" href="/javaBeanShop/${item.id}/edit">Edit</a>
		<a class="btn btn-danger" href="/javaBeanShop/${item.id}/delete">Delete</a>
		<a class="btn link" href="/javaBeanShop">Back to Shop</a>
	</div>
</body>
</html>