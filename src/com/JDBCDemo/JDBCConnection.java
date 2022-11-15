package com.JDBCDemo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Connection con;
		
		//loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//creating connection object
		//DriverManager .getConnection(url, username, password)
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blit1?serverTimezone=UTC&useSSL=false", "root", "adminroot");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Employee");
		
		while(rs.next()) {
			System.out.println("EmployeeID: "+rs.getInt("id")
			+"\tEmployee Firstname: "+rs.getString("employeefname")
			+"\tEmployee Lastname: " +rs.getString("employeelname")
			+"\tEmployee Address: " +rs.getString("employeeaddress")+"\n-----------------------------");
		
		}
	}
}