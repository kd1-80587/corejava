package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	Scanner sc=new Scanner(System.in);
   public Fruit() {
		this.isFresh=true;
	}
	
	public Fruit(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh=true;
		
	}
   	public void accept()
    {
    	System.out.println("enter the color of fruit=");
    	color=sc.next();
    	System.out.println("enter the weight of fruit=");
    	weight=sc.nextInt();
    	System.out.println("enter the name of fruit=");
    	name=sc.next();
    
    }
   
    public String taste()
    {
      return "no specific taste";	
    }
    
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	
	
	
	

}
