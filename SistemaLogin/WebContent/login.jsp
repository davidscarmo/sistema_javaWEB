<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Login</title>
</head>
<body>
	<form action="login" method="post">
		<p align ="center"> 
			<table cellpadding ="8">
				<tr>
					<td>Usuário: </td> <td><input type="text" name ="txtUsuario" /> </td>
				</tr>
				
				<tr>
					<td>Senha: </td> <td><input type="text" name ="txtSenha" /> </td>
				</tr>
				
				<tr>
					 <td colspan ="2" align ="center"><input type="submit" value ="logar"/> </td>
				</tr>
			</table>
		</p>
		
	</form>
</body>
</html>