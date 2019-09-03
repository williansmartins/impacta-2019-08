package com.williansmartins.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ImagensDAO {
	public static void main(String[] args) {
		//Roubei teu codigo
		try {
			String url = "jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String password = "Imp@ct@";
			
			Connection con = DriverManager.getConnection(url,user,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}