package com.micro.www.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.www.Model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
}
