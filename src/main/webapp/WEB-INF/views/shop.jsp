<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../style.css">
<title>javaBean shop</title>
</head>
<body>
	<div class="background" id="background-image">
	<div class="cowboy1"><br>SHOP</div>
	<div class="shop-itemsboard">
		<fieldset id="header">
			<div>
				<div class="quarter" id="header-center">Item</div>
				<div class="quarter" id="header">Description</div>
				<div class="eighth" id="header-center">Price</div>
				<div class="cart" id="header-center">Add to Cart</div>
			</div>
		</fieldset>
		<fieldset>
			<div><hr class="thick"></div>
			<c:forEach var="item" items="${items}">
				<div>
					<div class="quarter" id="center"><a id="btn-sml" href="/javaBeanShop/item/${item.id}/">${item.name}</a></div>
					<div class="quarter">${item.description}</div>
					<div class="eighth" id="center">$${item.price}</div>	
					<div class="cart"><a href="/javaBeanShop/cart/${item.id}/add"><img src="/images/cart.png" width="25%" height="25%"></img></a></div>
					<div class="hr-list"></div>	
				</div>
			</c:forEach>		
		</fieldset>
	</div>
	<a id="clickbox-small" href="/javaBeanShop/cart"><div class="cowboy3">view cart</div></a>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>