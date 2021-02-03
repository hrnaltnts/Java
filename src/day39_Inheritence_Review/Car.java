	package day39_Inheritence_Review;
	
	public class Car extends Vehicle {
		
		// "Car" is child class "Vehicle" is parent class
	
		private int wheels;
		private int doors;
		private int gears;
		private boolean isManual;
		private int currentGear;
		
	//	- > if parent class only has constructor with parameters,
	//	then child constructor MUST make a matching super(params) calls
		
	//	public class Vehicle {
	//		
	//		private String (name);
	//		private int (size);
	//		private int (currentVelocity);
	//		private int (currentDriection);
		
		public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
			super(name, size);
			//- > super() keyword is used to call parent class( "Vehicle" ) constructor.
			//- > super() needs to be the first statement in the constructor.
			this.wheels = wheels;
			//this.wheels = wheels1 *** ; It can be but you should change variable upside
			this.doors = doors;
			this.gears = gears;
			this.isManual = isManual;
			this.currentGear = 1;
		}
		
		public void changeGear(int currentGear) {
			this.currentGear=currentGear;
		}
		
		public void changeVelocity(int speed,int direction) {
			System.out.println("Car.changeVeloctiy():Veloctiy " + speed + " direction " + direction);
			super.move(speed,direction);
			// which move???
			// if there is same class
			// from class not parent 
			// but if write super get from parents
		}
		
	//  Overriding:
	//	    -> Declaring a method in subclass which is already present in the parent ("Vehicle") class
	//	   - > There must be a IS-A relationship
	//	   - > Method must have same name and same parameters in parent class
	//     - > Access modifiers( public - private - default -protected ) should be same or more visible
	//     - > Return type must be same or covariant type ( void-void  int-int )
	//	
		@Override
		public void move(int velocity, int direction) {
			setCurrentVelocity(velocity+10);
			setCurrentDriection(direction + 10);
			System.out.println("Vehicle.move(): Moving at " + getCurrentVelocity() + " in direction " + getCurrentDriection() );
			
			
		}
	
	
		
		
		
		
		
		
		
		
	}