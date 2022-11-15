package com.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		
		//you need to have a driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch13?serverTimezone=UTC&useSSL=false", "root", "adminroot");
			

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//class in java which is capable of taking SQL queries
		Statement stmt = con.createStatement();
		//resultset is like a collection which can hold the data
		ResultSet rs = stmt.executeQuery("select * from Employee");
		while(rs.next()) {
			System.out.println("EmployeeID "+ rs.getInt("idEmployee") + " Employee_Name " + 
		rs.getString("EmployeeName") + " Employee_Salary " + rs.getString("EmployeeSalary"));
		}
		
			
	}

}