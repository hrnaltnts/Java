package day13_Method;

public class LoopCallMethod {

	public static void main(String[] args) {
		
		System.out.println("hello frommain method");
		
		for(int i=0; i<5; i++) {
			displayMessage();
			System.out.println("Back in yhe main method");
		}
	}

	private static void displayMessage() {
		System.out.println("hello from displayMessage method");
		
	}

}
