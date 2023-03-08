package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.MyConnection;
import com.model.Teacher;

public class TeacherDao {
	public int register(String name,String gender,String address,String email,long phoneNumber ,String role,double salary){
		Connection con = null;
		PreparedStatement pst = null;

		int x = 0;
		con = MyConnection.getConnection();
		try {
			pst =  con.prepareStatement("Insert into teacher(name,gender,address,email,phoneNumber,role,salary) values(?,?,?,?,?,?,?)");
			pst.setString(1,name);
			pst.setString(2,gender);
			pst.setString(3,address);
			pst.setString(4,email);
			pst.setLong(5, phoneNumber);
			pst.setString(6,role);
			pst.setDouble(7, salary);
			x = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;

	}

	public Teacher getTeacherById(int teacherId){
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		con = MyConnection.getConnection();

		try {
			pst = con.prepareStatement("select * from teacher where teacherId = ?");
			pst.setInt(1, teacherId);
			rs = pst.executeQuery();

			if(rs.next()){
				Teacher teacher = new Teacher();
				teacher.setTeacherId(rs.getInt(1));
				teacher.setName(rs.getString(2));
				teacher.setGender(rs.getString(3));
				teacher.setAddress(rs.getString(4));
				teacher.setPhoneNumber(rs.getLong(5));
				teacher.setEmail(rs.getString(6));
				teacher.setRole(rs.getString(7));
				teacher.setSalary(rs.getDouble(8));
				return teacher;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<Teacher> getAllTeacher(){
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		con = MyConnection.getConnection();
		try {
			pst = con.prepareStatement("select * from teacher");
			rs = pst.executeQuery();				
			List<Teacher> techList = new ArrayList<Teacher>();
			while(rs.next()){
				Teacher teacher = new Teacher();
				teacher.setTeacherId(rs.getInt(1));
				teacher.setName(rs.getString(2));
				teacher.setGender(rs.getString(3));
				teacher.setAddress(rs.getString(4));
				teacher.setPhoneNumber(rs.getLong(5));
				teacher.setEmail(rs.getString(6));
				teacher.setRole(rs.getString(7));
				teacher.setSalary(rs.getDouble(8));
				techList.add(teacher);
			}
			return techList;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
	public int DeleteTecherById(int teacherId){
		Connection con = null;
		PreparedStatement pst = null;

		int x = 0;
		con = MyConnection.getConnection();
		try {
			pst =  con.prepareStatement("delete from teacher where teacherId = ?");
			pst.setInt(1, teacherId);
			x = pst.executeUpdate();
			} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return x;

	}
	
}
