package com.phdareys.app;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.phdareys.bean.Course;
import com.phdareys.bean.Meal;
import com.phdareys.dao.CourseJDBCTemplate;
import com.phdareys.dao.MealJDBCTemplate;

public class MySqlManage {
	// MAVEN+SPRING+JDBC(HSQLDB)
	// load du contexte dans un fichier XML, implantation de
	// l'objet principal, utilisation du mapper Spring,
	// implantation en classes

	public static void main(String[] args) {
		// lecture fichier XML
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		// récupération objet principal
		CourseJDBCTemplate courseJDBCTemplate = 
				(CourseJDBCTemplate) appContext.getBean("courseJDBCTemplate");
		// appel de la méthode de lecture de la table entière
		try {

			System.out.println ("Insertion: "+
					courseJDBCTemplate.add((Course) appContext.getBean("beanToInsert")));		

			System.out.println ("Get id 3: "+
					courseJDBCTemplate.get(3));		
			List<Course> courses = courseJDBCTemplate.get();	
			// affichage avec expr Lambda!
			courses.forEach(System.out::println);	
		}
		catch (Exception e) {
			System.out.println (e.getMessage());
		}

		MealJDBCTemplate mealJDBCTemplate = 
				(MealJDBCTemplate) appContext.getBean("mealJDBCTemplate");
		try {
			List<Meal> meals = mealJDBCTemplate.get();	
			// affichage avec expr Lambda!
			meals.forEach(System.out::println);	
		}
		catch (Exception e) {
			System.out.println ("Cannot list Meals!!");}

		appContext.close();
	}

}

