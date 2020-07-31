package fr.richard.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.richard.bean.Course;

public class CourseMapper implements RowMapper<Course> {
	
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		// association bean/sql
		Course c=new Course();
		c.setId(rs.getInt("idobjet"));
		c.setLibelle(rs.getString("libelle"));
		c.setQuantite(rs.getInt("quantite"));
		return c;
		}
}
