package day40_AccessModifiers_Final_Hiding2;

import day40_AccessModifiers_Final_Hiding.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		
		//c.model="M3";  	//all other class outside the same package -default- NO
		c.year=2017;        //all other class outside the same package -public- YES
		// c.engine=5.3;    //all other class outside the same package -protected- NO
		//c.door=4; 	 	//all other class outside the same package -private- NO
		
		

	}

}
