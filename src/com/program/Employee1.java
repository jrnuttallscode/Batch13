package com.program;

public class Employee1 {

	
		public Employee1 (Integer id, Integer age, String gender, String fname, String lname) {
			this.id = id;
			this.age = age;
			this.gender = gender;
			this.fname = fname;
			this.lname = lname;
		}
		private Integer id;
		private Integer age;
		private String gender;
		private String fname;
		private String lname;
		
		// Generate getters and setters.
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		@Override
		public String toString() {
			return this.id.toString() + " . " + this.age.toString(); 
		}
		
		// Too change the body of generated methods, choose Tools | Templates.
		
		
		
}
