package day14_MethodsCount;

public class Question2_Love6 {
	/*The number 6 is a truly great number. Write a method that accept
	 * num1 and num2 prtints true if either one is 6 or if their
	 * sum or difference is 6.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		love6(6,4);
	}

	private static void love6(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num1==6 || num2==6 || num1-num2==6 || num2-num1==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
