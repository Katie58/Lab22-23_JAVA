<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../style.css">
<title>${item.name} details</title>
</head>
<body onload="money()">
	<div class="background" id="background-image">
	<div class="cowboy1"><br>${item.name}</div>
	<form>		
		<fieldset class="left"></fieldset>
		<fieldset class="center">
			<br><br><strong>&nbsp;&nbsp;&nbsp;Item Details</strong><br><hr>
			<p><div class="form-left">Description:</div><div class="form-right">${item.description}</div></p>
			<p><div class="form-left">Quantity:</div><div class="form-right">${item.quantity}</div></p>
			<p><div class="form-left">Price:</div><div class="form-right" id="money"></div></p>
		</fieldset>
		<fieldset class="right"></fieldset>
		<a class="clickbox-sml" id="bottom-right" href="/admin/item/${item.id}/edit"><div class="cowboy3">Edit</div></a>
		<a class="clickbox-sml" id="bottom-right-right" href="/admin/item/${item.id}/delete"><div class="cowboy3">Delete</div></a>
		<a class="clickbox-sml" id="bottom-center20" href="/admin/items"><div class="cowboy3">Back to Items</div></a>
	</form>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>	
	<script>
		function money() {
		  var num = ${item.price};
		  var n = num.toFixed(2);
		  document.getElementById("money").innerHTML = '$' + n;
		}
	</script>
</body>
</html>