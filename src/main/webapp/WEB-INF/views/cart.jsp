<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../style.css">
<title>javaBean shop</title>
</head>
<body>
	<div class="background" id="background-image">
	<div class="cowboy1"><br>CART</div>
	<div class="shop-itemsboard">
		<fieldset>
			<div>
				<div class="quarter" id="header-center">Item</div>
				<div class="quarter" id="header">Description</div>
				<div class="eighth" id="header-center">Price</div>
				<div class="sixteenth">delete</div>
				<div class="sixteenth">edit</div>
				<div class="sixteenth" id="header-centerSml">Quantity</div>		
			</div>
		</fieldset>
		<fieldset id="scroll">
			<div><hr class="thick"></div>
			<c:forEach var="item" items="${cart}">
				<div>
					<div class="quarter" id="center"><a class="cowboy-link" href="javaBeanShop/item/${item.id}/">${item.name}</a></div>
					<div class="quarter">${item.description}</div>
					<div class="eighth" id="center">$${item.price}</div>
					<div class="trash"><a href="/javaBeanShop/item/${item.id}/delete"><img src="/images/trash.png" width="50%" height="50%"></img></a></div>		
					<div class="sixteenth"><a href="/javaBeanShop/item/${item.id}/add"><img src="/images/cart.png"></img></a></div>
					<div class="sixteenth" id="center">${cart.quantity}</div>	
				</div>
			</c:forEach>		
		</fieldset>
		div class="cowboy2"><a id="clickbox-lrg" href="/javaBeanShop">shop</a></div>
	</div>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>