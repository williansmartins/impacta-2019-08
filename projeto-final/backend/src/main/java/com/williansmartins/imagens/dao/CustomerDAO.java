package com.williansmartins.imagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.williansmartins.imagens.model.Customer;

public class CustomerDAO {
	
	private String url = "jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "Imp@ct@";
	
	public Customer buscarCustomer(int id) {
		Customer customer = new Customer();
		try {
			
			System.out.println("Conectando...");
			Connection con = DriverManager.getConnection(url,user, password);
			System.out.println("Conectado com sucesso!");

			Statement statement = con.createStatement();
			String sql = "select * from customer WHERE customer_id = ?";
			ResultSet resultSet = statement.executeQuery(sql);
			((PreparedStatement) statement).setInt(1, customer.getId());
			
			if (resultSet.next()) {
				System.out.println(">>" + resultSet.getString("first_name"));
				customer.setNome(resultSet.getString("first_name"));
				customer.setSobrenome(resultSet.getString("last_name"));
				customer.setId(resultSet.getInt("customer_id"));
				customer.setEmail(resultSet.getString("email"));			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customer;
	}

	 
		
		
		

	
	
	
	

	 

}
