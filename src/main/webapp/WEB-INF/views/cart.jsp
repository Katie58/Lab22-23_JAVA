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
	<%@include file="partials/header.jsp" %>
	<div class="cowboy1"><br>CART</div>
	<div class="shop-itemsboard">
		<fieldset>
			<div>
				<div class="quarter" id="header-center">Item</div>
				<div class="eighth" id="header-center">Price</div>
				<div class="sixteenth">delete</div>
				<div class="sixteenth">update</div>
				<div class="sixteenth" id="header-centerSml">Quantity</div>		
			</div>
		</fieldset>
		<fieldset id="scroll">
			<div><hr class="thick"></div>
			<c:forEach var="cartItem" items="${cart}">
				<div>
					<div class="quarter" id="center"><a class="cowboy-link" href="javaBeanShop/item/${cartItem.item.id}/">${cartItem.item.name}</a></div>
					<div class="eighth" id="center">$${cartItem.item.price}</div>
					<div class="trash"><a href="/javaBeanShop/cart/${cartItem.id}/delete"><img src="/images/trash.png" width="50%" height="50%"></img></a></div>		
					<div class="sixteenth"><a type="submit" href="/javaBeanShop/cart/${cartItem.id}/update">update</a></div>
					<div class="sixteenth"><input type="number" name="quantity" value="${cartItem.quantity}" min="1" max="${cartItem.item.stock}"/></div>
					<div class="hr-list"></div>	<!-- need form & submit button that seperates values or arrow up/down or something to fix -->
				</div>
			</c:forEach>		
		</fieldset>
		<div class="cowboy2"><a id="clickbox-lrg" href="/javaBeanShop">shop</a></div>
	</div>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>