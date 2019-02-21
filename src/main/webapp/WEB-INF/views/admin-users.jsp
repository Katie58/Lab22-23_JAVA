<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="background" id="background-image">
	<div class="cowboy1"><br>USERS</div>
	<div class="shop-itemsboard">
		<fieldset id="header">
			<div>
				<div class="eighth" id="header-center">Name</div>
				<div class="quarter" id="header">Email</div>
				<div class="eighth" id="header-center">Age</div>
				<div class="eighth" id="header-center">Password</div>
				<div>edit</div>
				<div>delete</div>
			</div>
		</fieldset>
		<fieldset>
			<div><hr class="thick"></div>
			<c:forEach var="user" items="${users}">
				<div>
					<div class="eighth" id="center"><a id="btn-sml" href="/admin/user${user.id}">${user.firstname} ${user.lastname}</a></div>
					<div class="quarter">${user.email}</div>
					<div class="eighth" id="center">${user.age}</div>
					<div class="eighth" id="center">${user.password}</div>	
					<div class="edit" id="btn-edit"></div>
					<div class="delete" id="btn-delete"></div>				
				</div>
				<div><hr class="list"></div>
			</c:forEach>		
		</fieldset>
		<div class="cowboy1"><a id="clickbox-lrg" href="/admin/user/add">add an item</a></div>
	</div>
	</div>
</body>
</html>