package com.phdareys.dao;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.phdareys.bean.Course;

public class CourseJDBCTemplate {
	private DataSource dataSource;	// passé depuis le XML!
	private JdbcTemplate jdbcTemplateObject; // le jdbcTemplate permet la connection	

	public void setDataSource(DataSource ds) throws Exception {
		System.out.println ("Inject DataSource");
		try {	
			this.dataSource = ds; // injecté depuis le XML!
			this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		}
		catch (Exception e) {
			throw new Exception ("Cannot connect");		
		}
	}

	public List<Course> get() throws Exception {
		String SQL = "select * from listecourses";
		List <Course> courses = null;
		// Spring commande
		try {
		  courses = jdbcTemplateObject.query(SQL, new CourseMapper());
		}
		catch (Exception e) {
			throw new Exception ("Cannot list: " + e.getMessage());
		}
		return courses;
	}
	
	public int add(Course c) {
	    String SQL = 
	    	"insert into listecourses (libelle, quantite) values (?, ?)";
		return (jdbcTemplateObject.update(SQL, 
				c.getLibelle(),
	    		c.getQuantite()));
	}
	public Course get(int id) {
	    String SQL = 
		    	"select *  FROM listecourses where id=" + id;
	    Course c = (Course) jdbcTemplateObject.queryForObject(SQL, new CourseMapper());
	    return c;
	}

}
