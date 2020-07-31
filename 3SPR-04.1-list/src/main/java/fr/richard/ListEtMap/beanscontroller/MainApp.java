package fr.richard.ListEtMap.beanscontroller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.richard.ListEtMap.beansmodel.Sport;


public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		
		Sport tennis = (Sport) appContext.getBean("tennis");
		
		System.out.println(tennis);

	}

}
