package com.micro.www.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.micro.www.Model.Student;
import com.micro.www.Service.StudentService;

@Controller
public class StudentController {

	 @Autowired
	 private StudentService service;
			 
	// Home Page
	@GetMapping("/")
	
	public String home(Model model) {
		model.addAttribute("students",service.getAllStudents());
		
		return "home";
	}
			    
	// Open Add Page
    @GetMapping("/add")
    
    public String addPage() {
    	
        return "add";
    }
    
    // Save Student
    @PostMapping("/save")
    public String saveStudent(Student student) {

        service.saveStudent(student);

        return "redirect:/";
    }
    
    // Open Update Page
    @GetMapping("/update/{id}")
    public String updatePage(@PathVariable int id,Model model) {

        Student student = service.getStudentById(id);

        model.addAttribute("student", student);

        return "update";
    }
    
    // Update Student
    @PostMapping("/update")
    public String updateStudent(Student student) {

        service.saveStudent(student);

        return "redirect:/";
    }
    
    // Delete Student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {

        service.deleteStudent(id);

        return "redirect:/";
    }
}
