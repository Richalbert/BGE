package fr.richard.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import fr.richard.bean.Course;

public class CourseJDBCTemplate implements CourseDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	// Spring passe par un template
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public List<Course> listCourses() {
		String SQL = "select * from listecourses";
		// Spring commande
		List <Course> courses = jdbcTemplateObject.query(SQL, new CourseMapper());
		return courses;
	}

	
}