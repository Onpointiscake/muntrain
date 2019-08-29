<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%-- Si no estás logeado el siguiente scriplet no permite acceder a esta página (Success.jsp)  y redirige otra vez al login.html--%> 
		<%
				if(session.getAttribute("usuario")==null){
					response.sendRedirect("login.html");
				}
		%>
		
		<h3>Estás logueado correctamente, ${usuario} ! </h3>
		<a href="prueba.html">Comienza el Test aquí</a>
</body>
</html>