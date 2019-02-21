<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../style.css">
<title>${item.name} edit</title>
</head>
<body>
	<div class="background" id="background-image">
		<h1>${item.name} edit</h1>
		<form action="/admin/${item.id}/edit" onsubmit="return validateForm()" method="post">
		<fieldset class="left"></fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;Add an Item</strong><br><hr>
			<p><div class="form-left">Name:</div><div class="form-right"><input type="text" name="name" value="${item.name}" required/></div></p>
			<p><div class="form-left">Description:</div><div class="form-right"><input type="text" name="description" value="${item.description}" required/></div></p>
			<p><div class="form-left">Quantity:</div><div class="form-right"><input type="number" name="quantity" value="${item.quantity}" required/></div></p>
			<p><div class="form-left">Price:</div><div class="form-right"><input type="number" step=".01" name="price" value="${item.price}" required/></div></p>
		</fieldset>
		<button type="submit">Save Changes</button>
		<a href="/admin/${item.id}/">Cancel</a>
		</form>
	</div>
</body>
</html>