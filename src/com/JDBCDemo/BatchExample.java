package com.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchExample {

	public static void main(String args[]) {

		List<EmployeeBean> list = new ArrayList<>();
		list.add(new EmployeeBean(20, "Aditi", "75020"));
		list.add(new EmployeeBean(21, "Aadhav", "21000"));
		list.add(new EmployeeBean(22, "Shruti", "23000"));
		list.add(new EmployeeBean(23, "Advaith", "22000"));
		list.add(new EmployeeBean(24, "SSwati", "23000"));
		list.add(new EmployeeBean(25, "Pradhyum", "230000"));
		list.add(new EmployeeBean(26, "Sreekar", "102300"));

		getConnection();
		insertEmployee(list);
	}
	public static Connection getConnection(){
		Connection con = null;
		try {
			// Loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch13?serverTimezone=UTC&useSSL=false", "root", "adminroot");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	private static void insertEmployee(List<EmployeeBean> empList){
		Connection con = null;
		String insertSQL = "Insert into employee (idEmployee, EmployeeName, EmployeeSalary) values (?, ?, ?)";
		PreparedStatement prepStmt = null;
		int[] count;
		try {
			con = getConnection();
			prepStmt = con.prepareStatement(insertSQL);
			for(int i = 0; i < empList.size(); i++){
				EmployeeBean emp = empList.get(i);
				prepStmt.setInt(1, emp.getIdEmployee());
				prepStmt.setString(2, emp.getEmployeeName());
				prepStmt.setString(3, emp.getEmployeeSalary());
				prepStmt.addBatch();   
				// Process batch of 5 records
				if(i%5 == 0){
					count = prepStmt.executeBatch();
				}  
			}
			count = prepStmt.executeBatch();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(con != null){
				//closing connection 
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} // if condition
		}
	} 

}
