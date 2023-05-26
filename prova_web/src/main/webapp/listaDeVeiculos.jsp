<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    <table>
	        <tr>
	            <th></th>
	            <th>Nome</th>
	            <th>Marca</th>
	            <th>Id</th>
	            <th></th>
	        </tr>
	        
	        <c:forEach items="${lista}" var="veiculo" varStatus="status">
	            <tr>
	                <td>${status.index + 1}</td>
	                <td>${veiculo.nome}</td>
	                <td>${veiculo.marca}</td>
	                <td>${veiculo.id}</td>
	            </tr>
	            
	            <td>
		           <form action="/prova_web/removerCarrosServlet" method="post" style="display:inline;">
			           <input type="hidden" name="id" value="${veiculo.id}" />
			           <button type="submit">REMOVER</button>
		           </form>
	           </td>
	        </c:forEach>       
	    </table>
</body>
</html>