package com.app.fruits;

public class Mango extends Fruit {

	
	

	public Mango() {
		super();
		setName("MANGO");
	}

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
		
	}

	@Override
	public void accept() {
		System.out.println("*****ENTER THE DETAILS OF MANGO*******");
		super.accept();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String taste() {
		
		return "Sour";
	}

}
