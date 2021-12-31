package com.munees.sts.service;

import java.util.List;

import com.munees.sts.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();

	Student saveStudent(Student student);
	
	Student updatStudent(Student student);
	
	Student getStudentById(Long id);
	
	void deleteStudentById(Long id);
}
