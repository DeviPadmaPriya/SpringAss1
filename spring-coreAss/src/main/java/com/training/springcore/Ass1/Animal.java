package com.training.springcore.Ass1;

public class Animal {
	
	private String color;
	private String food;
	
	public Animal() {
		
	}

	public Animal( String color, String food) {
	
		this.color = color;
		this.food = food;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	public String Details() {
	return "guess the animal ?"+this.getColor()+""+"in color"+"and eats"+this.getFood();
	}

}
