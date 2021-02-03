package day07_IfSatetements;

public class SmallTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1717
		//1-Wrimte an if stateent that assigns 5 to x when y is equal to 20
		int x,y;
		x=10;
		y=20;
		
		if(y==20) {
			x=5;
		}
		System.out.println("x= "+x+"y= "+y);
		
		//2-Write an if statement that multiplies payrate by 1.5 hours is greater than 40
		
		double payRate=1000;
		int hours=40;
		
		if(hours>40) {
			payRate=payRate*1.5;
		}
		System.out.println("Payrate is "+payRate);
		
		//3-Write an if statement that sets the variable fees to 50 if the boolean variable max is 
		
		boolean max=false;
		int fee=20;
		
		if (max==true) {
			fee=50;
		}
		System.out.println("Fee is "+ fee);
		
		//  4- Write an if statement that assigs 20 to the variable a if variable b is 50 or c is  greater
		//and equal 100
		
		int a=100;
		int b=50;
		int c=300;
		
		if (b==50 || c>=100) {
			a=20;		
		}
		System.out.println("a= " +a);
		
		// Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80 
		int temp=60;
		if(temp>=70 && temp<=80) {
			System.out.println("Ideal Temp");
		}
		System.out.println("Not Ideal Temp");
	}

}
