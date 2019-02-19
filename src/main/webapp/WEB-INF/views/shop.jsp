<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>javaBean shop</title>
</head>
<body>
	<div class="background" id="background-image">
		<h1>javaBean shop</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Item</th><th>Description</th><th>Quantity</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
				<tr>
					<td><a href="/javaBeanShop/${item.id}">${item.name}</a></td>
					<td>${item.description}
					<td>${item.quantity}</td>
					<td>${item.price}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/javaBeanShop/add" class="btn btn-secondary">Add Item</a>
	</div>
</body>
</html>