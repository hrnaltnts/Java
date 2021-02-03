package ReviewWeek4;
import java.util.*;

public class deneme {
	
	public static void main(String[] args) {
	    //WRITE YOUR CODE HERE
	    Scanner input= new Scanner(System.in);
	     System.out.println("Enter first number:");
	     int num1=input.nextInt();
	     System.out.println("Enter second number:");
	     int num2=input.nextInt();
	     System.out.println("Enter third number:");
	     int num3=input.nextInt();
	     
	     if(num1>num2 && num1<num3 || num1<num2 && num1>num3 ){
	       System.out.println("Medium value is: "+num1);
	       else if (num2>num1 && num2<num3 || num2<num1 && num2>num3 ){
	       System.out.println("Medium value is: "+num2);
	       else{
	       System.out.println("Medium value is: "+num3);
	  }
	}
	     }}}