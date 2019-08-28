package com.williansmartins.imagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ImagensDAO {
	public static void main(String[] args) {
		try {
			
		String url = "jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC";
		String login= "root";
		String password = "Imp@ct@";
		
		Connection con = DriverManager.getConnection(
				url, login, password);
		
		}catch (SQLException e) {
			// TODO: handle exception	
		e.printStackTrace();
		}
	}
}

