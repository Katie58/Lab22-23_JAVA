<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../style.css">
<title>javaBean items</title>
</head>
<body>
	<div class="background" id="background-image">
	<div class="cowboy"><br>SHOP</div>
	<div class="shop-itemsboard">
		<fieldset id="header">
			<div>
				<div class="eighth" id="header-center">Item</div>
				<div class="quarter" id="header">Description</div>
				<div class="eighth" id="header-center">Price</div>
				<div class="eighth" id="header-center">Quantity</div>
				<div>edit</div>
				<div>delete</div>
			</div>
		</fieldset>
		<fieldset>
			<div><hr class="thick"></div>
			<c:forEach var="item" items="${items}">
				<div>
					<div class="eighth" id="center"><a id="btn-sml" href="/admin/item/${item.id}/">${item.name}</a></div>
					<div class="quarter">${item.description}</div>
					<div class="eighth" id="center">${item.price}</div>
					<div class="eighth" id="center">${item.quantity}</div>	
					<div class="edit" id="btn-edit"></div>
					<div class="delete" id="btn-delete"></div>				
				</div>
				<div><hr class="list"></div>
			</c:forEach>		
		</fieldset>
		<div class="cowboy2"><a id="clickbox-lrg" href="/admin/item/add">add an item</a></div>
	</div>
	</div>
</body>
</html>