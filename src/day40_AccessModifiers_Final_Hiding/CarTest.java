package day40_AccessModifiers_Final_Hiding;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model="M3";  // same package -default- YES
		c.year=2017;   // same package -public- YES
		c.engine=5.3;  // same package -protected- YES
		//c.door=4;    // same package -private- NO
		
		

	}

}
