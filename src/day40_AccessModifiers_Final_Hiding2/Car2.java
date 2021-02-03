package day40_AccessModifiers_Final_Hiding2;

import day40_AccessModifiers_Final_Hiding.Car;


// car is not suit 
public class Car2 extends Car{
	
	public Car2() {
		
		//super();  // dont read write already made java		
		//model="M3"; //subclass outside the same package -default- NO
		year=2017;    //subclass outside the same package -public- YES
		engine=5.3;	  //subclass outside the same package -public- YES
		//door=4;     //subclass outside the same package -private- NO

		
	}

}
