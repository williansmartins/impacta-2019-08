package com.williansmartins.imagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ImagensDAO {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost/sakila";
			String user = "root";
			String password = "Imp@ct@";
			
			Connection con = DriverManager.getConnection(url,user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
