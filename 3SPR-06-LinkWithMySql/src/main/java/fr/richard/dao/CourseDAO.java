package fr.richard.dao;

import java.util.List;

import javax.sql.DataSource;

import fr.richard.bean.Course;

public interface CourseDAO {
	public void setDataSource(DataSource ds);
	public List<Course> listCourses();



}
