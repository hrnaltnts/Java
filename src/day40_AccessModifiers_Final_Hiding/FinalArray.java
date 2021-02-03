package day40_AccessModifiers_Final_Hiding;

public class FinalArray {

	public static void main(String[] args) {
		
		final int [] TEAMS= {11,11};
		
		System.out.println(TEAMS[0]);
		
		TEAMS[0]=15; //FINAL DONT MAKE ANY DIFERENCE because this is reference
		System.out.println(TEAMS[0]);
		
		int nums[] = new int[] {20,20,40};
		nums=new int []{10,50,100};
		
		final int [] finalNums = {23,66,44};
		finalNums[0]=120;
		
		//finalNums = new int [] {1,2,3}; u cannot change because those reference
		
		}
		
		



	}


