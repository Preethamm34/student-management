package com.bobthecoder.sm.service;

import java.util.List;

import com.bobthecoder.sm.api.Student;

public interface StudentService {

	List<Student> loadStudents();

	void saveStudent(Student student);
	
	// to display student id in the uplade
	Student getStudent(int id);

	//to create a update method
	void update(Student student);

	//to delete student
	void deleteStudent(int id);
	
}
