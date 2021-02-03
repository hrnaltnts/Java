package day09_summaryOfflowStatements;
import java.util.Scanner;

public class Task38_DaysSwitch {

	 public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    
		    int countWord=word.length();
		    
		    for(int a=0; a<=countWord; a++){
		      if(word.charAt(a)=='a'||word.charAt(a)=='e'||word.charAt(a)=='u'||word.charAt(a)=='i'||word.charAt(a)=='o'){
		         S	ystem.out.print(word.charAt(a));
		      }
		    }
		    
		  }
		}