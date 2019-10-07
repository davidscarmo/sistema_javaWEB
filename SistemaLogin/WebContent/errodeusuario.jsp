<%@ page isErrorPage="true" %>
<%@ page import ="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro de Login</title>
<style type="text/css">
body
{
	background-color: #fff;
	
}

#cabecalho
{
	background-color: #fff;
	width: 800px;
	height: 80px;
}

#corpo
{
	background-color: #fff;
	width: 800px;
	height: 450px;
}

#rodape
{
	background-color: #fff;
	width: 800px;
	height: 80px;
}
</style>
</head>
<body>
	<div align = "center">
	<div id="cabecalho">
	
	</div>
	<div id="corpo">
		<img src = "imagens/erro1.jpg">
		<hr/>
		Error <%=exception.getMessage() %> <br/>
		Exceção ocorrida <%=exception.getClass() %> <br/>
		<hr/>
		<a href="login.jsp">Tentar Novamente</a>
	</div>	
	<div id="rodape">
	Rodape
	</div>
	</div>
</body>
</html>