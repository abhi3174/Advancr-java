package com.service;

import com.dao.StudentDao;
import com.dao.StudentDaoImple;
import com.dto.Student;

public class StudentServiceImple implements StudentService{
	
	private StudentDao studentDao;
	
	public StudentServiceImple() {
		studentDao=new StudentDaoImple();
	}

	@Override
	public int registerStudent(Student student) {
		return studentDao.insertStudent(student);
	}

	@Override
	public boolean login(Student student) {
		
		return false;
	}

}
