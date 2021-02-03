package day04_aritmaticOperators;

public class wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double regularWage;
		double pasePay=25.75;
		double regularHours=40;
		double overtimeWages;
		double overTimePay=37.5;
		double overTimeHours=15;
		double totalWage;
		
		regularWage=pasePay*regularHours;
		overtimeWages=overTimePay*overTimeHours;
		totalWage=regularWage+overtimeWages;
		System.out.println("Wage for this weekmare$"+ totalWage);
		
		

	}

}
