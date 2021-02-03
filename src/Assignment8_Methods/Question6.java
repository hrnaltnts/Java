package Assignment8_Methods;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner(System.in);
		
		int number= scan.nextInt();
		
		
		isPalindrome(number);
		

	}

	private static void isPalindrome (int num) {
		// TODO Auto-generated method stub
		int remainder, reversedInteger=0;
		int originalInteger=num;
		 
		 while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }

	        // palindrome if orignalInteger and reversedInteger are equal
	        if (originalInteger == reversedInteger)
	            System.out.println(true);
	        else
	            System.out.println(false);
	    }
	}
	
	




