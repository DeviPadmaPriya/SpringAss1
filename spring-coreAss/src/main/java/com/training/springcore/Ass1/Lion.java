package com.training.springcore.Ass1;

public class Lion extends Animal {
	
	private  String name;
	
	public Lion() {
		
	}
	public Lion(String color,String food,String name) {
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
		
		return this.getName()+" "+" is a wild animal,"+" who is "+this.getColor()+" "+"in color"+",eats "+this.getFood();
	}

}
