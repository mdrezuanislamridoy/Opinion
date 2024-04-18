package com.opinion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;

	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/Opinion";
	        String username = "root";
	        String password = "Ridoy781@#$";
	        con = DriverManager.getConnection(url, username, password);
	        
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;

}
}