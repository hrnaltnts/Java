package day39_Inheritence_Review;

public class Toyota extends Car{
	
	private int roadService;
	//you should call parent class
		//source - Generate Constructor field

	public Toyota(int roadService) {
		//super(name, size, wheels, doors, gears, isManual); autmaticly
		super("Toyota", "4WD", 4, 4, 6, false);
		this.roadService = roadService;
	}
	
	public void acclerate(int rate) {
		
		// why we use get because currentVelocity is private
		int newVelocity= getCurrentVelocity() +rate;
		
		if(newVelocity==0) {
			stop();
			changeGear(1);
		}else if(newVelocity>0 && newVelocity<=10) {
			changeGear(1);
		}
		else if(newVelocity>10 && newVelocity<=20) {
			changeGear(2);
		}
		else if(newVelocity>20 && newVelocity<=30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		if(newVelocity>0) {
			changeVelocity(newVelocity, getCurrentVelocity());
		}
		
	}
	
	
	

}
