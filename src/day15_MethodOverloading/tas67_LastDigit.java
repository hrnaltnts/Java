package day15_MethodOverloading;

public class tas67_LastDigit {

	public static void main(String[] args) {
		
		if(lastDigit(7,17)) {
			System.out.println("They have the same last digit");
		}else {
			System.out.println("They dont have the same last digit");
		}
					

	}

	private static boolean lastDigit(int num1, int num2) {
		
		if((num1%10)==(num2%10)) {
			return true;
		}else {
		return false;
	}

}
}