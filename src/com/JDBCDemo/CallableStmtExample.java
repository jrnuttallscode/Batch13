package com.JDBCDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.SQLException;

public class CallableStmtExample {
	
	public static void main(String[] args) {
	    Connection connection = null;
	    try {
	      // Loading driver
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      
	      // Creating connection
	      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch13?serverTimezone=UTC&useSSL=false", 
	                          "root", "adminroot");
	      
	      // Getting CallableStatement object
	      CallableStatement cStatement = connection.prepareCall(
	        "{call callfromJava(?, ?, ?)}");
	      // Setting params
	      cStatement.setInt(1, 2);
	      // Registering OUT parameters Using 
	      // JDBCType enum which is added in Java 8
	      cStatement.registerOutParameter(2, JDBCType.VARCHAR);

	      cStatement.registerOutParameter(3, JDBCType.VARCHAR);

	      cStatement.executeQuery();

	      // Reading the OUT paramter here 
	      System.out.println("Fetched Result " + "EmployeeName: " + cStatement.getString(2) + 
	        " EmployeeSalary: " + cStatement.getString(3));
	   
	    } catch (ClassNotFoundException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }finally{
	      if(connection != null){
	        //closing connection 
	        try {
	          connection.close();
	        } catch (SQLException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	        }
	      } // if condition
	    }// finally
	  }
	
}
