package com.munees.sts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.munees.sts.entity.Student;
import com.munees.sts.repository.StudentRepository;
import com.munees.sts.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{
	
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return  studentRepository.save(student);
	}

	@Override
	public Student updatStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
		
	}

}
