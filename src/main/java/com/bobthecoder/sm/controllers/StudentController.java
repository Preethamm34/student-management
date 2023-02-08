package com.bobthecoder.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bobthecoder.sm.DAO.StudentDAO;
import com.bobthecoder.sm.api.Student;
import com.bobthecoder.sm.service.StudentService;

@Controller
public class StudentController {

	// service objects
	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {

		// call the Service method to get the data
		List<Student> studentlist = studentService.loadStudents();

		for (Student tempStudent : studentlist) {

			System.out.println(tempStudent);
		}

		model.addAttribute("students", studentlist);

		return "student-list";
	}

	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);

		return "add-Student";
	}

	@PostMapping("/save-student")
	public String saveStudent(Student student) {

		/// logid to save data to database
		System.out.println(student);

		//do the controller check
		//if the user doesnot have an id then do a insert
		//if the user does have a id --> do update
		
		if(student.getId() == 0) {
			
			//insert a new record
			studentService.saveStudent(student);
		}
		else {
			//do update
			studentService.update(student);
		}
		
		
		// to a service call save datad to DB
		// studentService.saveStudent(student);

		return "redirect:/showStudent";
	}

	// update student info
	// to display student id in the uplade

	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id, Model model) {

		// we should give the user object who click on the update button
		System.out.println("looking data for the student having id :" + id);

		// to display student id in the uplade
		Student theStudent = studentService.getStudent(id);
		System.out.println(theStudent);

		model.addAttribute("student", theStudent);
		
		return "add-Student";
	}
	
	//delete method /deleteStudent
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {

		//capture the id of the student whome u want to delete
		//once captured do a servide call to dele the student
		
		studentService.deleteStudent(id);
		
		
		return "redirect:/showStudent";
	}
}
