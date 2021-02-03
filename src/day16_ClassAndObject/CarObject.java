package day16_ClassAndObject;

public class CarObject {

	public static void main(String[] args) {
		
		
		Car car1 =new Car();
		
		car1.printCarInfo();
		
		car1.make="Ford";
		car1.model="Fiesta";
		car1.currentSpeed=55;
		
		car1.printCarInfo();
		car1.accelerate(50);
		car1.drive();
	}

}
