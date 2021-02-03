package day04_aritmaticOperators;

public class contribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this program calculate the amount of pay that will be contributedto a retirement plan if 5%, 8% or 10% of monthly is withheld
		
		//VAriablea to hold the monthly pay and the amount of contribution 
		
		double monthlyPay=6000;
		double contribution;
		
		//calculate and display 5% contribution
		contribution=monthlyPay*0.05;
		
		System.out.println("5 percent is $"+contribution+" per month");

	}

}
