package com.impacta.imagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.impacta.imagens.model.Customer;

public class ImagensDAO {
	
	List<Customer> lista = new ArrayList<>();
	
	public Customer buscarCustomer(int id) {

		Customer customer = new Customer();
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC", "root", "Imp@ct@");
			System.out.println("Conexão estabelecida com sucesso!");
			Statement stmt = con.createStatement();
			ResultSet rslt = stmt.executeQuery("SELECT * FROM Customer WHERE customer_id = " + id);
			
			if(rslt.next()) {
				System.out.println(">> " + rslt.getString("first_name"));
				customer.setId(rslt.getInt("customer_id"));
				customer.setNome(rslt.getString("first_name"));
				customer.setSobrenome(rslt.getString("last_name"));
				customer.setEmail(rslt.getString("email"));
			}
			
		} catch (SQLException e) {
			System.out.println("Houve um erro de SQL!");
			e.printStackTrace();
		}
		
		return customer;
	}
	
	public List<Customer> buscarCustomers() {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC", "root", "Imp@ct@");
			System.out.println("Conexão estabelecida com sucesso!");
			Statement stmt = con.createStatement();
			ResultSet rslt = stmt.executeQuery("SELECT * FROM Customer");
			
			int id;
			String nome;
			String sobrenome;
			String email;
			
			while(rslt.next()) {
				id = rslt.getInt("customer_id");
				nome = rslt.getString("first_name");
				sobrenome = rslt.getString("last_name");
				email = rslt.getString("email");
				lista.add(new Customer(id, nome, sobrenome, email));
			}
			
			lista.forEach(c -> System.out.println(c));
			
			return lista;
			
		} catch (SQLException e) {
			System.out.println("Houve um erro de SQL!");
			e.printStackTrace();
		}
		return lista;
	}
	
	
	public void inserirCustomer(Customer customer) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC", "root", "Imp@ct@");
			System.out.println("Conexão estabelecida com sucesso!");
			Statement stmt = con.createStatement();
			ResultSet rslt = stmt.executeQuery("INSERT INTO Customer(customer_id, first_name, last_name, email) VALUES(" + customer.getId() + ", " + customer.getNome() + ", " + customer.getSobrenome() + ", " + customer.getEmail() + ")");
			System.out.println("Customer " + customer.getId() + " adicionado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Houve um erro de SQL!");
			e.printStackTrace();
		}
		
	}

	public void removerCustomer(int id) {
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC", "root", "Imp@ct@");
		System.out.println("Conexão estabelecida com sucesso!");
		Statement stmt = con.createStatement();
		System.out.println("Removendo o customer: " + buscarCustomer(id));
		String sql = "DELETE FROM Customer WHERE customer_id = " + id;
		System.out.println(sql);
		int rslt = stmt.executeUpdate(sql);
		System.out.println(rslt);
		
	} catch (SQLException e) {
		System.out.println("Houve um erro de SQL!");
		e.printStackTrace();
	}
}
	public void updateCustomer(Customer customer) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC", "root", "Imp@ct@");
			System.out.println("Conexão estabelecida com sucesso!");
			Statement stmt = con.createStatement();
			int rslt = stmt.executeUpdate("UPDATE Customer SET first_name = '" + customer.getNome() + "', last_name = '" + customer.getSobrenome() + "', email = '" + customer.getEmail() + "' WHERE customer_id = " + customer.getId());
			System.out.println(rslt);
			System.out.println("Atualizando o customer: " + buscarCustomer(customer.getId()));
		}
		catch(SQLException e) {
			System.out.println("Houve um erro de SQL!");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	}
}
