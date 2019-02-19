<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>${item.name} edit</title>
</head>
<body>
	<div class="background" id="background-image">
		<h1>${item.name} edit</h1>
		<form action="/javaBeanShop/${item.id}/edit" method="post">
		<table class="table">
			<tr>
				<th scope="row">Description</th>
				<td><input type="text" name="description" value="${item.description}" /></td>
			</tr>
			<tr>
				<th scope="row">Quantity</th>
				<td><input type="number" name="quantity" value="${item.quantity}" /></td>
			</tr>
			<tr>
				<th scope="row">Price</th>
				<td><input type="number" name="price" value="${item.price}" /></td>
			</tr>
		</table>
		<button type="submit" class="btn btn-primary">Save Changes</button>
		<a class="btn link" href="/javaBeanShop/${item.id}">Cancel</a>
		</form>
	</div>
</body>
</html>