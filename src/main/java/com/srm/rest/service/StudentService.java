package com.srm.rest.service;

import java.util.List;

import com.srm.rest.entity.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	
	public void saveStudent(Student student);
	
	public void deleteStudent(int id);
	
	public Student getStudent(int id);
}
