package day40_AccessModifiers_Final_Hiding;

public class Car extends Object  {
	
	//extends Object  dont read write every time it made automaticly by java
	
	
	String model;    //default 
	public int year;
	private int door;
	protected double engine;
	
	
	public Car() {
		super();
		this.model = model;
		this.year = year;
		this.door = door;
		this.engine = engine;
	}

}

