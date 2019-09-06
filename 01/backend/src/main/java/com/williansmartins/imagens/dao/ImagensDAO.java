package com.williansmartins.imagens.dao;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.williansmartins.imagens.model.Imagem;

public class ImagensDAO {

	private String url = "jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "Imp@ct@";

	public Imagem buscarImagem(int id) {
		Imagem imagem = new Imagem();
		try {

			System.out.println("Conectando...");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com sucesso!");

			Statement statement = con.createStatement();
			String sql = "select * from imagem WHERE imagem_id = ?";
			ResultSet resultSet = statement.executeQuery(sql);
			// ((PreparedStatement) statement).setInt(1, imagem.getUrl());

			/*
			 * if (resultSet.next()) { System.out.println(">>" +
			 * resultSet.getString("first_name"));
			 * imagem.setId(resultSet.getInt("imagem_id")); }
			 */

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return imagem;
	}

	public List<Imagem> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
=======
public class ImagensDAO {
	 
>>>>>>> dev

}
