package com.JDBCDemo;

public class EmployeeBean {

	   int idEmployee;
	   String EmployeeName;
	   String EmployeeSalary;
	   
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [idEmployee=" + idEmployee + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + "]";
	}
	public EmployeeBean(int idEmployee, String employeeName, String employeeSalary) {
		super();
		this.idEmployee = idEmployee;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}
}
