package com.williansmartins.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.williansmartins.imagens.model.Customer;

public class TestarConexao {

	private final static String url = "jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC";

	private final static String username = "root";
	private final static String password = "Imp@ct@";

	private Connection con;
	private Statement stmt;
	private ResultSet resultSet;

	private String first_name = null;
	private String last_name = null;

	public static void main(String[] args) {
		TestarConexao b = new TestarConexao();
		b.openDB();
		b.buscarCustomers();
		b.closeDB();
	}

	public void openDB() {
		try {
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso!\n");
		} catch (SQLException e) {
			System.out.println("\nNão foi possível estabelecer conexão " + e + "\n");
			System.exit(1);
		}
	}

	public void closeDB() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("\nNão foi possível fechar conexão " + e + "\n");
			System.exit(1);
		}
	}

	public void setFirst_name(String first_name) {
		if (first_name.trim().length() == 0)
			this.first_name = null;
		else
			this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		if (last_name.trim().length() == 0)
			this.last_name = null;
		else
			this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	private List<Customer> dados = new ArrayList<>();

	

	public List<Customer> buscarCustomers() {
		String query;

		try {
			query = "SELECT * FROM customer";
			System.out.println("\nMostrando dados.\n");

			resultSet = stmt.executeQuery(query);
			while (resultSet.next()) {
				Customer customer;
				customer = new Customer(
						resultSet.getInt("customer_id"),
						resultSet.getString("first_name"),
						resultSet.getString("last_name"),
						resultSet.getString("email"));

				dados.add(customer);
			}

			return dados;
		} catch (

		SQLException e) {
			setFirst_name(null);
			setLast_name(null);
		}
		return null;
	}

}