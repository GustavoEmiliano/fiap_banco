package br.com.fiap.conecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection conectar () {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "tm08", "21072006");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
