package com.munees.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.munees.sts.entity.Student;
import com.munees.sts.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Muneeswaran", "B", "b.muneeswaran.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Pandi", "B", "pandi@muneeswaran.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Hema", "chandu", "hemaan.com");
//		studentRepository.save(student3);
//		
//		Student student4 = new Student("Ugesh", "s", "ugeshran.com");
//		studentRepository.save(student4);
	}
	
	

}
