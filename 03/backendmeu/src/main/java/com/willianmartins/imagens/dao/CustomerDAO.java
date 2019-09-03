package com.willianmartins.imagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.williansmartins.imagens.model.Customer;

public class CustomerDAO {
	private final String url = "jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC";
	private final String user = "root";
	private final String password = "Imp@ct@";
	
	
	private List<Customer> lista = new ArrayList<>();
	
	public Customer buscarCustomer(int id) {
	try {
			
			System.out.println("Conectando...");
			Connection con = DriverManager.getConnection(url,user, password);
			System.out.println("Conectado com sucesso!");

			Statement statement = con.createStatement();
			String sql = "select * from customer WHERE customer_id ="+id;
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				System.out.println(">>" + resultSet.getString("first_name"));
				
				Customer customer = new Customer();
				customer.setNome(resultSet.getString("first_name"));
				customer.setSobrenome(resultSet.getString("last_name"));
				customer.setId(resultSet.getInt("customer_id"));
				customer.setEmail(resultSet.getString("email"));
				
				lista.add(customer );
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista.get(0);
	}
	
	public List<Customer> buscarCustomers() {
		try {
			
			System.out.println("Conectando...");
			Connection con = DriverManager.getConnection(url,user, password);
			System.out.println("Conectado com sucesso!");

			Statement statement = con.createStatement();
			String sql = "select * from customer";
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				System.out.println(">>" + resultSet.getString("first_name"));
				
				Customer customer = new Customer();
				customer.setNome(resultSet.getString("first_name"));
				customer.setSobrenome(resultSet.getString("last_name"));
				customer.setId(resultSet.getInt("customer_id"));
				customer.setEmail(resultSet.getString("email"));
				
				lista.add(customer );
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
}

