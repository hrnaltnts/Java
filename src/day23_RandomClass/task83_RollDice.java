package day23_RandomClass;
import java.util.*;

public class task83_RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1;
		int dice2;
		String again="y";
		
		Scanner sc =new Scanner(System.in);
		Random rn = new Random();
		
		while(again.equalsIgnoreCase("y")) {
			
			System.out.println("Rolling the dice...");
			dice1=rn.nextInt(6)+1;
			dice2=rn.nextInt(6)+1;
			
			System.out.println("Their values are:");
			System.out.println(dice1+"-"+dice2);
			
			System.out.println("Roll them agin (y=yes)?");
			again=sc.nextLine(); //y or n
		}
				

	}

}

//Rolling the dice...
//Their values are:
//5-3
//Roll them agin (y=yes)?

