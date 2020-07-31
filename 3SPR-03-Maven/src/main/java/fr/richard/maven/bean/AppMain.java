package fr.richard.maven.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import fr.richard.maven.model.Student;

public class AppMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		
				// of course, an ApplicationContext is just a BeanFactory
				Student obj=(Student)appContext.getBean("helloBean");;
				System.out.println(obj);
				
				Student obj1=(Student)appContext.getBean("helloBean1");
				System.out.println(obj);
				
				Student obj2=(Student)appContext.getBean("helloBean2");
				System.out.println(obj2);		
				
				Student obj3=(Student)appContext.getBean("helloBean3");
				System.out.println(obj3);
				
				appContext.close();

	}

}
