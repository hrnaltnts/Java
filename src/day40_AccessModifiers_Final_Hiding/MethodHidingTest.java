package day40_AccessModifiers_Final_Hiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Bear{
	public static void eat(){
		System.out.println("Bear is eating");		
	}
	public static void sneeze () {
		System.out.println("Bear is sneezing");
	}
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}


class Panda extends Bear{
	public static void eat(){
		System.out.println("Panda is eating");		
	}
	/*
	public void sneeze () {
		System.out.println("Panda is sneezing");
	}
	
	*/
	
	@Override
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
}