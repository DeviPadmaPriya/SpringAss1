package com.training.springcore.Ass1;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	private String fname;
	private String lname;
	
	@Autowired
	private Animal Favanimal;
	
	public Person() {
		
	}
	

	public Person(String fname, String lname) {
		
		this.fname = fname;
		this.lname = lname;
	}


	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Animal getFavanimal() {
		return Favanimal;
	}

	public void setFavanimal(Animal favanimal) {
		Favanimal = favanimal;
	}
	public String getAnimalSetails() {
		return this.Favanimal.Details();
	}
	public String Details() {
		return " "+this.getFname()+" "+this.getLname()+"''Favanimal'' Rabbit --Color: "+Favanimal.getColor()+" eats:"+Favanimal.getFood();
	}

	
	
}
