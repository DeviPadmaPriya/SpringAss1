package com.training.springcore.Ass1;

public class Dog extends Animal {
	
	private String name;
	
	public Dog() {
		
	}
	public Dog(String color,String food,String name) {
		
		super(color,food);
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String Details() {
		return  " Dog name: "+this.getName()+" ,Color : "+this.getColor()+" ,Eats: "+this.getFood();
		
	}
	
		
	

}
