package com.bobthecoder.sm.DAO;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bobthecoder.sm.api.Student;

@Component
public interface StudentDAO {

	List<Student> loadStudents();

	// to save datad to DB

	public void saveStudent(Student student);
	
	//to display student id in the uplade

	 Student getStudent(int id);

	//to create a update method
	void update(Student student);

	//delete student
	void deleteStudent(int id);
}
