package fr.richard.twobeans.beancontroller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.richard.twobeans.beanmodel.Address;
import fr.richard.twobeans.beanmodel.Employee;



public class AppMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		
				// of course, an ApplicationContext is just a BeanFactory
				Address address1=(Address)appContext.getBean("address1");;
				System.out.println(address1);
		
				Address address2=(Address)appContext.getBean("address2");;
				System.out.println(address2);
				
				Employee employee1=(Employee)appContext.getBean("employee1");;
				System.out.println(employee1);
				
				Employee employee2=(Employee)appContext.getBean("employee2");;
				System.out.println(employee2);
				
				Employee emp2 = (Employee)appContext.getBean("createNewEmp2");;
				System.out.println(emp2);
				
				
	
	}

}
