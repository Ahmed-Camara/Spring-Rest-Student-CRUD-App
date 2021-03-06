package com.srm.rest.dao;

import java.util.List;

import com.srm.rest.entity.Student;

public interface StudentDAO {
	
	public List<Student> getStudents();
	
	public void saveStudent(Student student);
	
	public void deleteStudent(int id);
	
	public Student getStudent(int id);
}