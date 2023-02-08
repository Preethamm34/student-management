package com.bobthecoder.sm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bobthecoder.sm.api.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student student = new Student();

		student.setId(rs.getInt("id")); // 1
		student.setName(rs.getString("name")); // preetham
		student.setMobile(rs.getLong("mobile")); // 9844601556
		student.setCountry(rs.getString("country")); // Mysore

		return student;
	}

};