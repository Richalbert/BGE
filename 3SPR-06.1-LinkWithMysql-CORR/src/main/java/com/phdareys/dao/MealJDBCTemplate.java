package com.phdareys.dao;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.phdareys.bean.Course;
import com.phdareys.bean.Meal;

public class MealJDBCTemplate {
	private DataSource dataSource;
	// Spring passe par un template, cet objet dispose de nombreuses méthodes
	private JdbcTemplate jdbcTemplateObject;	

	public void setDataSource(DataSource ds) {
		// injecté depuis le XML!
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Meal> get() throws Exception {
		String SQL = "select * from listemeal";
		List <Meal> meals = null;
		// Spring commande
		try {
			meals = jdbcTemplateObject.query(SQL, new MealMapper());
		}
		catch (Exception e) {
			throw new Exception ("Cannot list Meals: " + e.getMessage());
		}
		return meals;
	}
}
