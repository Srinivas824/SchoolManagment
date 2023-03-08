package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.MyConnection;
import com.model.Students;

public class StudentDao {
	public int studentRegister(String studentFullName,String fatherName,int age,String gender,String address
			,int studentClass,double feePaid,double feeDue,double totalFee,long phoneNo){
		Connection con = null;
		PreparedStatement pst = null;

		int x = 0;
		con = MyConnection.getConnection();

		try {
			pst =  con.prepareStatement("Insert into students(studentFullName,fatherName,age,gender,address,studentClass,feePaid,feeDue,totalFee,phoneNo) values(?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1,studentFullName);
			pst.setString(2,fatherName);
			pst.setInt(3, age);
			pst.setString(4,gender);
			pst.setString(5,address);
			pst.setInt(6, studentClass);
			pst.setDouble(7, feePaid);
			pst.setDouble(8, feeDue);
			pst.setDouble(9, totalFee);
			pst.setLong(10, phoneNo);
			x = pst.executeUpdate();
		
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return x;


	}
	public List<Students> DisplayStudentByClass(int studentClass){
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		List<Students> studentList = new ArrayList<Students>();
		con = MyConnection.getConnection();
		try {
			pst = con.prepareStatement("select * from students where studentClass = ?");
			rs = pst.executeQuery();
			pst.setInt(1, studentClass);
			while(rs.next()){
				Students student = new Students();
				student.setStudentId(rs.getInt(1));
				student.setStudentFullName(rs.getString(2));
				student.setFatherName(rs.getString(3));
				student.setAge(rs.getInt(4));
				student.setGender(rs.getString(5));
				student.setAddress(rs.getString(6));
				student.setStudentClass(rs.getInt(7));
				student.setFeePaid(rs.getDouble(8));
				student.setFeeDue(rs.getDouble(9));
				student.setTotalFee(rs.getDouble(10));
				student.setPhoneNo(rs.getLong(11));
				studentList.add(student);

			}
		return studentList;
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return null;
		
	}

}
