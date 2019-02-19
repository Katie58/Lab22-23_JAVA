<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>Confirmation</title>
</head>
<body>
<div class="background" id="background-image">
	<div class="thanks">
		<h1>Thanks.</h1>
		
		<p>
			<%-- Dot notation to access getters in Expression Language. --%>
			${ user.firstname }, you are registered. 
		</p>
		<p>	
			Return <a href="/">home</a>.
		</p>
	</div>
</div>
</body>
</html>