package com.training.springcoreAss1.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.training.springcore.Ass1.Dog;
import com.training.springcore.Ass1.Lion;
import com.training.springcore.Ass1.Person;

public class Springconfig {
	
	public static void main (String args[]) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
	
	Lion l1 = (Lion)context.getBean("Lion");
	Dog d1 = (Dog)context.getBean("Dog");
	Person Person = (Person)context.getBean("Person");
	
	System.out.println("Dog Details:"+d1.Details());
	System.out.println("Lion details:"+l1.Details());
	System.out.println("Person Details:"+Person.Details());


}
}