package com.williansmartins.dao;

import java.sql.*;

public class ImagensDAO {
	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String password = "Imp@ct@";
			
			System.out.println("Conectando ...");
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Conectado com sucesso!!");
			
			Statement statement = con.createStatement();
			String sql = "select * from customer";
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next())
				System.out.println(">>"+ resultSet.getString("first_name"));
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}