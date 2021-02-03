package Assignment8_Methods;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner(System.in);
		
		int number= scan.nextInt();
		
		
		sign(number);
		

	}

	private static void sign(int sayi) {
		// TODO Auto-generated method stub
		if(sayi>0) {
			System.out.println(1);
			   }else if(sayi<0) {
					System.out.println(-1);
				
		}else { System.out.println(0);
		
	}}}



