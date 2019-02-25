<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../style.css">
<title>Users</title>
</head>
<body>
	<div class="background" id="background-image">
	<div class="cowboy1"><br>USERS</div>
	<div class="shop-itemsboard">
		<fieldset id="header">
			<div>
				<div class="name" id="header-center">Name</div>
				<div class="eighth" id="header">Email</div>
				<div class="eighth" id="header-center">Age</div>
				<div class="eighth" id="header-center">Password</div>
				<div class="edit">edit</div>
				<div class="delete">delete</div>
			</div>
		</fieldset>
		<fieldset>
			<div><hr class="thick"></div>
			<c:forEach var="user" items="${users}">
				<div>
					<div class="name" id="center"><a id="btn-sml" href="/admin/user/${user.id}/">${user.firstname} ${user.lastname}</a></div>
					<div class="eighth">${user.email}</div>
					<div class="eighth" id="center">${user.age}</div>
					<div class="eighth" id="center">${user.password}</div>	
					<div class="edit" id="btn-edit"></div>
					<div class="delete" id="btn-delete"></div>				
				</div>
				<div><hr class="list"></div>
			</c:forEach>		
		</fieldset>
		<div class="cowboy2"><a id="clickbox-lrg" href="/admin/user/add">add a user</a></div>
	</div>
		<div class="home">Return <a href="/">home</a>.</div>
	</div>
</body>
</html>