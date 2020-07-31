package fr.richard.first.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.richard.first.model.Student;

public class TestIocByConstr {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		
				// of course, an ApplicationContext is just a BeanFactory
				Student student=(Student)appContext.getBean("studentbean");
				student.displayInfo();
				appContext.close();

	}

}
