package Assignment8_Methods;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter first number:");
		int first=scan.nextInt();
		System.out.println("enter first number:");
		int second=scan.nextInt();
		
		
		plus(first,second);
		

	}

	private static void plus(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
		
		
	}

}
