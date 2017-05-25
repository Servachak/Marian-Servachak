<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="/css/registration.css" type="text/css">
</head>
<body>
<div class="login" >
	<div class="login-triangle"></div>
	 <h2 class="login-header">Log in</h2>
	<form class="login-container" action="/registration" method="post">
	
		<input type="text" name= "userName" placeholder=" Enter name">
		<br>
		<input type="email" name= "userEmail"  placeholder=" Enter Email">
		<br>
		<input type="password" name= "userPassword"  placeholder=" Enter password">
		<br>
		<input type="text" name= "userSex"  placeholder=" Enter sex">
		<br>
		<br>
		 <p><input type="submit" value="Log in"></p>
		</form>
</div>
	<ol>
		<c:forEach var= "u" items="${users}" >
		<li>${u.name} ${u.email} ${u.password} ${u.sex}<a href= "/deleteUser/${u.id}">delete</a> <a href="/updateUser/${u.id}"> update</a>
		</li>
		</c:forEach>
		</ol>
</body>
</html>
