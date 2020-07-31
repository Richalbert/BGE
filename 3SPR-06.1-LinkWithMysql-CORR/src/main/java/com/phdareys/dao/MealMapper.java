package com.phdareys.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.phdareys.bean.Meal;

// rowMapper est fourni par Spring, il permet de mapper objet et table de BD
public class MealMapper implements RowMapper<Meal> {

	public Meal mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new Meal(rs.getInt("id"), rs.getString("name"));
	}

}
