package com.srm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srm.rest.entity.Student;
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
		
		return studentService.getStudent(studentID);
	}
}
