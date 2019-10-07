package br.com.SistemaLogin.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.SistemaLogin.conexao.CriarConexao;


@WebServlet("/CadastroLogin")
public class CadastroLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CadastroLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("txtUsuario");
		String senha = request.getParameter("txtSenha");
		
		Connection con;
		try {
			con = CriarConexao.getConexao();
			Login l = new Login();
			l.setUsuario(usuario);
			l.setSenha(senha);
			
			LoginDAO dao = new LoginDAO(con);
			dao.adicionar(l);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
