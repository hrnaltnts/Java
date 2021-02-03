package Assignment8_Methods;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner(System.in);
		
		int x= scan.nextInt();
		int max= scan.nextInt();
		
		
		max(x, max);
		

	}

	private static void max(int x, int max) {
		// TODO Auto-generated method stub
		
		if(x>max) {
			System.out.println(max);
		}else {
			System.out.println(x);
		}
		
	}
	
	
}



