package day38_Inheritance_Cnt;

public class Contractor extends Employee {

	@Override
	public void CalculatePay(int hours, double rate) {
		double total =(hours*rate)*200;
		System.out.println("Contractor total pay: "+total);
	}
	
	

}

