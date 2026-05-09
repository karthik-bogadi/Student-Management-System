package com.micro.www.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.www.Model.Student;
import com.micro.www.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
    private StudentRepository repo;
	
	public Student saveStudent(Student student) {
        return repo.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // Get Student By Id
    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    // Update Student
    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    // Delete Student
    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
