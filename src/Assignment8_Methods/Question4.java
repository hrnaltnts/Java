package Assignment8_Methods;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner(System.in);
		
		int number= scan.nextInt();
		
		
		HollowRect(number);
		

	}

	private static void HollowRect(int sayi) {
		// TODO Auto-generated method stub
		for(int a=1; a<=sayi; a++) {

			     for(int j=1; j<=sayi; j++)
			       {
			         if(a==1||a==sayi || j==1||j==sayi) 
			         System.out.print("*");  
			         else
			         System.out.print(" ");        
			         
			       }
			   System.out.println();    
			   }
		}
		
	}


