package br.com.SistemaLogin.conexao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class CriarConexao 
{
	
	public static Connection getConexao() throws SQLException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Conectado");
			
			return DriverManager.getConnection("jdbc:mysql://localhost/SistemaLogin?useTimezone=true&serverTimezone=UTC", "root", "123456");
		}
		catch(SQLException | ClassNotFoundException e)
		{
			throw new SQLException(e);
		}
	}

}
