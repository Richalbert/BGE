package com.phdareys;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.phdareys.beans.Employee;


public class AppMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
		       new String[] {"applicationContext.xml"});	
					// loop on all beans of xml file
		for (String beanName: appContext.getBeanDefinitionNames()) 
					// filter only beans of class Employee
			if (appContext.getBean(beanName).
					getClass().toString().contains("Employee")) 			
				((Employee)appContext.getBean(beanName)).show();

		appContext.close();
	}
}
