<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../style.css">
<title>add item</title>
</head>
<body>
	<div class="background" id="background-image">
		<div class="cowboy1">javaBeanShop</div>
		<form action="/admin/item/add" onsubmit="return validateForm()" method="post">
		<fieldset class="left"></fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;Add an Item</strong><br><hr>
			<p><div class="form-left">Name:</div><div class="form-right"><input name="name" required/></div></p>
			<p><div class="form-left">Description:</div><div class="form-right"><input name="description" required/></div></p>
			<p><div class="form-left">Quantity:</div><div class="form-right"><input name="quantity" type="number" required/></div></p>
			<p><div class="form-left">Price:</div><div class="form-right"><input name="price" type="number" step=".01" required/></div></p>
		</fieldset>
		<fieldset class="right">
		<button id="clickbox-small" type="submit" href="/admin/item/add"><div class="cowboy3">ADD</div></button>
		<a href="/admin/items">Cancel</a>
		</fieldset>
		</form>
	</div>
</body>
</html>