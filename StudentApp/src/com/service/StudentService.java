package com.service;


import com.dto.Student;

public interface StudentService {
	int registerStudent(Student student);
	boolean login(Student student);
}
