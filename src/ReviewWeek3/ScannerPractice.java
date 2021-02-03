package ReviewWeek3;

import java.util.Scanner;



public class ScannerPractice {

	public static void main(String[] args) {
		//creating a scenner object
		Scanner scan=new Scanner(System.in);
		
		//ask queation to user know waht to enter
		System.out.println("Enter number 1");
		int num1 =scan.nextInt();
		System.out.println("YOU HAVE ENTERED NUM1 AS: "+num1);
		
		System.out.println("Enter number 2");
		int num2 =scan.nextInt();
		System.out.println("YOU HAVE ENTERED NUM2 AS: "+num2);
		
		//PRINT OUT THE SUM OF 2 NUMBERS:
		System.out.println("sum of num1 and num2 is:" + (num1 + num2));

	}

}
