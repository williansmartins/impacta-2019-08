package com.willianmartins.imagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Imgagens_DAO {

	public static void main(String[] args) {
		try {
			String url ="jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC"; 
			String user = "root"; 
			String password = "Imp@ct@";
			
			Connection con = DriverManager.getConnection (url, user,password);
			con.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
