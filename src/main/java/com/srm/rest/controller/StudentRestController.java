package com.srm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srm.rest.entity.Student;
import com.srm.rest.exceptionsHandler.StudentNotFoundException;
import com.srm.rest.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return studentService.getStudents();
		
	}
	
	@GetMapping("/student/{studentID}")
	public Student getStudent(@PathVariable int studentID) {
		
		
		Student student = studentService.getStudent(studentID);
		
		if(student == null) {
			
			throw new StudentNotFoundException("Student not found id : "+studentID);
		}
		
		
		return student;
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		
		
		student.setId(0);
		
		studentService.saveStudent(student);
		
		System.out.println(student);
		
		return student;
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		
		studentService.saveStudent(student);
		
		return student;
	}
}
