package day10_TernaryOperator_For_Loop;

public class task45_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//user should be able to declRE 2 VALUE AND PROGRAM SHOULD DISPLAY WHICH NUMBER IS LARGEST
		//IF NUMBERS EQUAL IT SHOULD DISPLAY NUMBERS ARE EQUAL
		//ABOVE STEPS TO REPEATED TO NUMBERS OF TIMES THAT IS ALSO DECLEARED BY USERS
		int number1=2;
		int number2=20;
		int repeat=4;
		
		for(int i=1; i<=repeat;i++) {
			if(number1>number2) {
			System.out.println("number 1 is greater");
			}else if(number2>number1) {
				System.out.println("number 2 is greater");
			}else if(number1==number2) {
				System.out.println("numbers equal");
		}
		}
		

	}

}
