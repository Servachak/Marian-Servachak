<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center; margin-top: 10%">
	<form action="/flower" method="post">
		<input type="text" name= "flowerName" placeholder= "Enter flower">
		<br>
		<input type="text" name= "flowerColor" placeholder= "Enter color">
		<br>
		<input type="number" name= "flowerPrice" placeholder= "Enter price">
		<br>
		<select name="coun">
			<c:forEach var="coun" items="${countries}">
			<option value="${coun.id}">${coun.name}</option>
			</c:forEach>
		</select>
		<br>
		<button>save flower</button>
		</form>
</div>
<ol>
<c:forEach var="f" items="${flowers}">
   <li> ${f.name} ${f.color} ${f.price} 
   <c:forEach var="coun" items="${f.countrys}">${coun.name}
   </c:forEach><a href="/deleteFlower/${f.id}">delete</a> <a href="/updateFlower/${f.id}"> update </a>
   </li>
</c:forEach>
</ol>
</body>
</html>