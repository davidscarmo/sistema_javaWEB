<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logado</title>
</head>
<body>
	<% String nomeUsuario = (String) session.getAttribute("usuarioautenticado");
	if(nomeUsuario == null)
		throw new ServletException("Nenhum usuário Logado");
	
	%>
	
	Seja Bem Vindo <%=nomeUsuario %> | <a href="remover.jsp">Sair </a>
	<h2>Logado com sucesso!</h2>
</body>
</html>