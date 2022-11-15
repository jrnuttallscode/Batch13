package com.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtDemo {

	public static void main(String[] args) throws SQLException {
		Connection con =  null;
		
		//you need to have a driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch13?serverTimezone=UTC&useSSL=false", "root", "adminroot");
			

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String str = "insert into Employee(idEmployee, EmployeeName, EmployeeSalary) VALUES (?,?,?)";
		//PreparedStatmemt is a pre-compiled statement 
		//it is possible to insert the data into the database
		PreparedStatement ps = con.prepareStatement(str);
		
		ps.setInt(1, 19);
		//commenting a parameter is throwing error
		//but you can pass in null value as a parameter
		ps.setString(2, "Olu");
		ps.setString(3,"175000");
		
		int s = ps.executeUpdate();
		System.out.println(s);
		

	}

}