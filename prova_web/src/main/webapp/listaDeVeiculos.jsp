<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.list, br.com.unifip.prova_web.servlet.Veiculos"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="C:\Users\ANDRE\Desktop\Arthur\prova web 2\css\telaInicial.css">
    <title>LISTA DE VEICULOS</title>
</head>
<body>
    <h1>LISTA DE VEICULOS</h1>
    <ul>
    	<%List<Veiculos> lista = (List<Veiculos>)request.getAttribute("lista"); 
    	for(Veiculos veic : lista) { %>
    	<li><%=vei %></li>
    </ul>
</body>
</html>