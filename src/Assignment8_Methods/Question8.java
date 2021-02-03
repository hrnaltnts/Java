package Assignment8_Methods;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner(System.in);
		
		int number= scan.nextInt();
		
		
		fib(number);
		

	}

	private static void fib(int count) {
		// TODO Auto-generated method stub
		int n = count-1, t1 = 0, t2 = 1;
		  for (int i = 1; i <= n; ++i)
	        {
	            //System.out.print(t1 + " + ");

	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
		
		System.out.println(t1);
	}
	
}



