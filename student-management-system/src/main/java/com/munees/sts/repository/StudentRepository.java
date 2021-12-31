package com.munees.sts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.munees.sts.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{

}
