package com.training.springcore.Ass1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalspringTest {
		
	public static void main(String args[]) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
	Lion l1 = (Lion)context.getBean("Lion");
	Dog d1 = (Dog)context.getBean("Dog");
	Person person1 = (Person)context.getBean("Person");
	
	System.out.println("Dog Details:"+d1.Details());
	System.out.println("lion details:"+l1.Details());
	System.out.println("person Details:"+person1.Details());
	

}
}