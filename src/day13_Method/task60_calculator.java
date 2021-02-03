package day13_Method;

public class task60_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator(12,24,"+");
		calculator(13,24,"*");
		calculator(1,24,"/");
		calculator(4,28,"-");

	}

	private static void calculator(int i, int j, String operator) {
		switch(operator) {
		case"+":
			System.out.println(i+j);
			break;
		case"*":
			System.out.println(i*j);
			break;
		case"-":
			System.out.println(i-j);
			break;
		case"/":
			System.out.println(i/j);
			break;
		}
		
	}

}
