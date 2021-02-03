package Assignment8_Methods;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter number:");
		int first=scan.nextInt();
		
		
		
		cube(first);
		

	}

	private static void cube(int i) {
		// TODO Auto-generated method stub
		System.out.println(i*i*i);
		
		
	}

}
