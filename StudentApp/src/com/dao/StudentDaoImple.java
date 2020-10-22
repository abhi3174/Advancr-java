package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.conn.Myconn;
import com.dto.Student;

public class StudentDaoImple implements StudentDao{
	
	private Myconn myConn;

	public StudentDaoImple() {
		myConn = new Myconn(); 
	}
	
	@Override
	public int insertStudent(Student student) {
		int i = 0;
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("insert into student(studentname,studentpass) values(?,?)");
			s.setString(1, student.getStudentName());
			s.setString(2, student.getStudentPass());
			i = s.executeUpdate();
			s.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public boolean login(Student student) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
