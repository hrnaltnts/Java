package ReviewWeek3;

import java.util.Scanner;

public class SeasonCodeWithScanner {

	public static void main(String[] args) {
		
		System.out.println("What is the Season");
		
		Scanner scan=new Scanner(System.in);
		
		 String season =scan.next(); // 1,2,3,4
		    // 1 : Spring   2: Summer  3 : Fall  4 : Winter 
		    
		    switch(season) {
		    
		      case "Spring" :
		        System.out.println("picnic");
		        break ; // this is or breaking out of the switch statement
		      case "Summer" : 
		        System.out.println("swimming");
		        break ; 
		        //both case same action
		      case "Autumm":
		      case "Fall" : 
		        System.out.println("hiking");
		        break; 
		      case "Winter" :
		        System.out.println("snowboarding");
		        break; 
		      default :
		        System.out.println("INVALID ENTRY");
		        break; // This is optional here because this is the last line of switch anyway​
		    
		    


	}
		    
	}
	
}


