package com.bobthecoder.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bobthecoder.sm.DAO.StudentDAO;
import com.bobthecoder.sm.api.Student;

@Service
public class StudentServiceImpl implements StudentService {

	// create a object
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> loadStudents() {

		List<Student> studentList = studentDAO.loadStudents();

		return studentList;
	}

	@Override
	public void saveStudent(Student student) {

		// write the business logics
		// company criteria

		if (student.getCountry().equals("Bangalore")) {

			// write the email sending logic here

			System.out.println("Mail sent to : " + student.getName());

		}

		studentDAO.saveStudent(student);

	}

	// to display student id in the uplade
	@Override
	public Student getStudent(int id) {

		return studentDAO.getStudent(id);
	}

	////to create a update method
	@Override
	public void update(Student student) {
		
		studentDAO.update(student);
		
	}
	
//delete student
	@Override
	public void deleteStudent(int id) {
		
		studentDAO.deleteStudent(id);
	}

}
