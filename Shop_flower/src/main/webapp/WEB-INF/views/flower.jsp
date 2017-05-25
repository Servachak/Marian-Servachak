<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/flower.css" type="text/css">
</head>
<body>
<div class="container">  
  <form id="contact" action="/flower" method="post">
    <h3>My Flowers</h3>
    <fieldset>
      <input type="text" name= "flowerName" placeholder= "Enter flower" required autofocus>
    </fieldset>
    <fieldset>
     <input type="text" name= "flowerColor" placeholder= "Enter color" tabindex="2" required>
    </fieldset>
    <fieldset>
     <input type="number" name= "flowerPrice" placeholder= "Enter price" tabindex="3" required>
    </fieldset>
    <fieldset>
     <select name="coun" tabindex="4" required>
			<c:forEach var="coun" items="${countries}">
			<option value="${coun.id}">${coun.name}</option>
			</c:forEach>
		</select>
    </fieldset>
        <fieldset>
      <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Save Flower</button>
    </fieldset>
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