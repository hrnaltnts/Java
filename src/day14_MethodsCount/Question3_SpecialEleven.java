package day14_MethodsCount;

public class Question3_SpecialEleven {
	
	/* 
	 * we'll say a number is special if it is a multiple of 11
	 * or if is one more than a multiple of 11.
	 * Write a method that accept a number and prints true if the 
	 * given number is special.
	 */
	
	

	public static void main(String[] args) {
		
		specialEleven(22);
		specialEleven(23);
	}

	private static void specialEleven(int i) {
		
		if (i%11==0 || (i-1)%11==0||i%11==1 ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
