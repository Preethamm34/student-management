package com.bobthecoder.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bobthecoder.sm.api.Student;
import com.bobthecoder.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {

		// write the logic to fetch the datas od students from the data base

		// List<Student> studentList = new ArrayList<Student>();

		String sql = "SELECT * FROM students";

		List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());
		System.out.println(sql);

		return theListOfStudent;
	}

	// to save datad to DB
	@Override
	public void saveStudent(Student student) {
		Object[] sqlParameters = { student.getName(), student.getMobile(), student.getCountry() };

		String sql = "INSERT INTO students(name, mobile, country) values(?, ?, ?)";
		jdbcTemplate.update(sql, sqlParameters);

		System.out.println("1 record updated....");
	}

	// no need
	// to display student id in the uplade
	@Override
	public Student getStudent(int id) {

		String sql = "SELECT * FROM students WHERE ID = ?";
		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);

		return student;
	}

	// to create a update method
	@Override
	public void update(Student student) {

		String sql = "UPDATE students SET name = ?, mobile = ?, country = ? WHERE id = ? ";
		jdbcTemplate.update(sql, student.getName(), student.getMobile(), student.getCountry(), student.getId());
		System.out.println("1 recoed updated");

	}

	//delete student
	@Override
	public void deleteStudent(int id) {
		
		String sql = "DELETE FROM students WHERE id = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("1 record deleted");
		
	}

}
