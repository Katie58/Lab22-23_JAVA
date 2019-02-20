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
			<div>
				<div class="eighth" id="header-center">Item</div>
				<div class="description" id="header">Description</div>
				<div class="eighth" id="header-center">Price</div>
				<div class="eighth" id="header-center">Quantity</div>
			</div>
		</fieldset>
		</fieldset>
			<div><hr></div>
			<c:forEach var="item" items="${items}">
				<div id="shop-items">
					<div class="eighth" id="strong-center"><a href="/javaBeanShop/${item.id}">${item.name}</a></div>
					<div class="description">${item.description}</div>
					<div class="eighth" id="center">${item.price}</div>
					<div class="eighth" id="center">${item.quantity}</div>
				</div>
			</c:forEach>		
		</fieldset>
		<a id="add-item" href="/javaBeanShop/add"></a>	
	</div>
	</div>
</body>
</html>