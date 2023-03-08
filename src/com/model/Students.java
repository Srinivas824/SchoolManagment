package com.model;

public class Students {
	//studentId | studentFullName | fatherName | age  | gender | address  | studentClass; | feePaid  | feeDue   | totalFee
	private int studentId;
	private String studentFullName;
	private String fatherName;
	private int age;
	private String gender;
	private String address;
	private int studentClass;
	private double feePaid;
	private double feeDue;
	private double totalFee;
	private long phoneNo;
	public Students(){

	}
	public Students(int studentId, String studentFullName, String fatherName, int age, String gender, String address,
			int studentClass, double feePaid, double feeDue, double totalFee, long phoneNo) {
		super();
		this.studentId = studentId;
		this.studentFullName = studentFullName;
		this.fatherName = fatherName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.studentClass = studentClass;
		this.feePaid = feePaid;
		this.feeDue = feeDue;
		this.totalFee = totalFee;
		this.phoneNo = phoneNo;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFullName() {
		return studentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public int getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	public double getFeePaid() {
		return feePaid;
	}
	public void setFeePaid(double feePaid) {
		this.feePaid = feePaid;
	}
	public double getFeeDue() {
		return feeDue;
	}
	public void setFeeDue(double feeDue) {
		this.feeDue = feeDue;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentFullName=" + studentFullName + ", fatherName="
				+ fatherName + ", age=" + age + ", gender=" + gender + ", address=" + address + ", studentClass="
				+ studentClass + ", feePaid=" + feePaid + ", feeDue=" + feeDue + ", totalFee=" + totalFee + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
}
