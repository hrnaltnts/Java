package day10_TernaryOperator_For_Loop;

public class task42_sumOfevenAndOddNumbers {
	public static void main(String[] args) {
		int sumEven=0;
		int sumOdd=0;
	
	for(int i=1; i<=100; i++) {
		if(i%2==0) {
			sumEven=sumEven+i;//0+2=2...
		}else {
			sumOdd=sumOdd+i;//0+1=1...
				
			}
		
		}
		System.out.println("Sum of even number "+sumEven);
		System.out.println("Sum of odd number "+sumOdd);
	}

}
