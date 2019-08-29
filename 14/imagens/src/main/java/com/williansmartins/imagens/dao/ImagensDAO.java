package com.williansmartins.imagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.williansmartins.imagens.model.Customer;

public class ImagensDAO {
	//Criação atributos
	private static Connection con;
	private static ResultSet resultSet;
	private static Statement statement;
	static List<Customer> customers = new ArrayList<Customer>();

	public List<Customer> buscarCustomers() {
		try {
			//Conexão
			String url = "jdbc:mysql://localhost/sakila?useTimezone=tru&serverTimezone=UTC";
			String user = "root";
			String password = "Imp@ct@";

			System.out.println("Conectando...");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com Sucesso!");

			//Selecionando todos da tabela
			statement = con.createStatement();
			String sql = "select * from customer";
			resultSet = statement.executeQuery(sql);
			
			
			//Preenchendo a lista com os atributos e a lista com a lista + imprimindo
			while (resultSet.next()) {
				
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("customer_id"));
				customer.setNome(resultSet.getString("first_name"));
				customer.setSobrenome(resultSet.getString("last_name"));
				customer.setEmail(resultSet.getString("email"));

				customers.add(customer);
				System.out.println(customer);
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		return customers;
	}
	
	
}
