package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ImagensDao {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/sakila?useTimezone=true&serverTimezone=UTC";
		String user=  "root";
		String password = "Imp@ct@";		
		try {
			Connection c = DriverManager.getConnection(url,  user , password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
