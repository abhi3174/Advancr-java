package com.conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Myconn {
	private static final String Driver_Class="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/abc";
	private static final String USER_NAME="root";
	private static final String PASSWORD="root";
	private Connection con;
	public Connection getConn() throws ClassNotFoundException, SQLException {
		if(con == null || con.isClosed()) {
			Class.forName(Driver_Class);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		return con;
	}
}
