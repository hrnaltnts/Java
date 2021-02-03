package day08_ElseIFStatetment;

public class SwitchCase {

	public static void main(String[] args) {
		
		String weather="sunny";
		
		switch(weather) {
		
		case "sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go to Swimming");
			break;
		case "windy":
			System.out.println("Go Snowboarding");
			break;
		default:
			System.out.println("Code Java in any weather");
		
		}

	}

}
