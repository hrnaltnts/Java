package day38_Inheritance_Cnt;

public class FulltimeEmployee extends Employee {
	
	public void calculatePay (int hours, double rate) {
		double total =(hours*rate)*1.05;
		
	}

}
