<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../style.css">
<title>${item.name} edit</title>
</head>
<body>
	<div class="background" id="background-image">
		<div class="cowboy1"><br>${item.name} &nbsp&nbsp edit</div>
		<form action="/admin/item/${item.id}/edit" method="post">
		<fieldset class="left"></fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;Edit Item</strong><br><hr>
			<p><div class="form-left">Name:</div><div class="form-right"><input type="text" name="name" value="${item.name}" required/></div></p>
			<p><div class="form-left">Description:</div><div class="form-right"><input type="text" name="description" value="${item.description}" required/></div></p>
			<p><div class="form-left">Quantity:</div><div class="form-right"><input type="number" name="quantity" value="${item.quantity}" required/></div></p>
			<p><div class="form-left">Price:</div><div class="form-right"><input type="number" name="price" min="0" value="${item.price}" step="0.01" required/></div></p>
		</fieldset>
		<button class="cowboy2" type="submit">Save Changes</button>
		<a href="/admin/item/${item.id}/">Cancel</a>
		</form>
			<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>