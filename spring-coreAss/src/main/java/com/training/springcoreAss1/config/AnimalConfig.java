package com.training.springcoreAss1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.springcore.Ass1.Animal;
import com.training.springcore.Ass1.Dog;
import com.training.springcore.Ass1.Lion;
import com.training.springcore.Ass1.Person;

@Configuration
public class AnimalConfig<Favanimal> {
	
	@Bean("Person")
	public Person getPerson() {
		Person p=new Person();
		p.setFname("Devi");
		p.setLname("priya");
		return p;
		
	}
@Bean("Dog")
public Dog getDog() {
	Dog d1=new Dog();
	d1.setFood("Pedigree");
	d1.setColor("white");
	return d1;
}
	
@Bean("Lion")
public Lion getLion() {
	Lion l1=new Lion();
	l1.setFood("Animals");
	l1.setColor("Golden brown");
	return l1;
}
@Bean("Favanimal")
public Animal getfavAnimal() {
	Animal animal = new Animal();
	animal.setFood("carrot");
	animal.setColor("white");
	return animal;
	
	
}
	
}
