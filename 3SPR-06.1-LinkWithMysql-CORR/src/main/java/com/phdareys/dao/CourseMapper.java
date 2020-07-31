package com.phdareys.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.phdareys.bean.Course;

// rowMapper est fourni par Spring, il permet de mapper objet et table de BD
public class CourseMapper implements RowMapper<Course> {

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// association bean/sql
		Course c=new Course();
		c.setId(rs.getInt("id"));
		c.setLibelle(rs.getString("libelle"));
		c.setQuantite(rs.getInt("quantite"));
		return c;
	}

}
