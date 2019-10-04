package br.com.SistemaLogin.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.SistemaLogin.exception.InvalidUserException;

/**
 * Servlet implementation class LoginControllers
 */
@WebServlet("/login")
public class LoginControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		proccessRequest(request, response); 
		
	}



	private void proccessRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		ValidaDadosRecebidos(req); 
		RequestDispatcher rd = req.getRequestDispatcher("logado.jsp");
		rd.forward(req, resp);
	}



	private void ValidaDadosRecebidos(HttpServletRequest req) throws ServletException 
	{
		String nomeUsuario = req.getParameter("txtUsuario"); 
		String nomeSenha = req.getParameter("txtSenha"); 
		
		if(!nomeUsuario.trim().equals("David") || !nomeSenha.trim().equals("123"))
		{
			throw new invalidUserException("Login ou senha inválidos!");
		}
	}
	

}
