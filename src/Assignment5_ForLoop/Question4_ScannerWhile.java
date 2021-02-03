package Assignment5_ForLoop;

import java.util.Scanner;

public class Question4_ScannerWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please Enter a Number as multiable 10");
		int a=scan.nextInt();
		while(a<100) {
			System.out.println(a);
			a++;
		}
		

	}

}
