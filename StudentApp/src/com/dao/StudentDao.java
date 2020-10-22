package com.dao;

import com.dto.Student;

public interface StudentDao {
	int insertStudent(Student student);
	boolean login(Student student);
}
