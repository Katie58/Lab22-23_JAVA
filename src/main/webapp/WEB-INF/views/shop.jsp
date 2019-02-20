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
	<div class="shop"></div>
	<div class="shop-itemsboard">
		<fieldset id="header">
			<div class="row">
				<div class="quarter" id="header-center">Item</div>
				<div class="description" id="header">Description</div>
				<div class="eighth" id="header">Price</div>
				<div class="eighth" id="header">Quantity</div>
			</div>
		</fieldset>
		</fieldset>
			<div class="row"><hr></div>
			<c:forEach var="item" items="${items}">
				<div class="row" id="shop-items">
					<div class="quarter" id="strong-center"><a href="/javaBeanShop/${item.id}">${item.name}</a></div>
					<div class="description">${item.description}</div>
					<div class="eighth">${item.price}</div>
					<div class="eighth">${item.quantity}</div>
				</div>
			</c:forEach>		
		</fieldset>
		<a id="add-item" href="/javaBeanShop/add"></a>	
	</div>
	</div>
</body>
</html>