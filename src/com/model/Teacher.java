package com.model;

public class Teacher {
	
//	| teacherId | name     | gender | address   | phoneNumber | email                | role  | salary
	private int teacherId;
	private String name;
	private String gender;
	private String address;
	private String email;
	private long phoneNumber;
	private String role;
	private double salary;
	
	public Teacher(){
		
	}

	public Teacher(int teacherId, String name, String gender, String address, String email, long phoneNumber,
			String role, double salary) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.salary = salary;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
}
