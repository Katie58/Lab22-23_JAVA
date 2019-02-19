<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>add item</title>
</head>
<body>
	<div class="background" id="background-image">
		<h1>javaBeanShop</h1>
		<h2>Add an item</h2>
		<form action="/javaBeanShop/add" method="post">
		<table class="table">
			<tr>
				<th scope="row">Name</th>
				<td><input type="text" name="name" autofocus/></td>
			</tr>
			<tr>
				<th scope="row">Description</th>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<th scope="row">Quantity</th>
				<td><input type="number" name="quantity" /></td>
			</tr>
			<tr>
				<th scope="row">Price</th>
				<td><input type="number" step=".01" name="price" /></td>
			</tr>
		</table>
		<button type="submit" class="btn btn-primary" href="/javaBeanShop/add">Add</button>
		<a class="btn link" href="/javaBeanShop">Cancel</a>
		</form>
	</div>
</body>
</html>