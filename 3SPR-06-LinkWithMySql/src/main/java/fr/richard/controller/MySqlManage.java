package fr.richard.controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.richard.bean.Course;
import fr.richard.dao.CourseJDBCTemplate;

public class MySqlManage {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		
		CourseJDBCTemplate courseJDBCTemplate =
				(CourseJDBCTemplate) appContext.getBean("courseJDBCTemplate");
				// appel de la méthode de lecture de la table entiè re
				List<Course> courses = courseJDBCTemplate.listCourses();
				// ....
				appContext.close();
	}

}
