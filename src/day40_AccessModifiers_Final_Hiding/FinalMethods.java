package day40_AccessModifiers_Final_Hiding;

public class FinalMethods {
	
	
	public final void method1() {
		System.out.println("Method-1");
	}
	
	public static final void StaticMethod(String word) {
		System.out.println("Static Method");
	}

	
}

class Sub extends FinalMethods{
	/*
	 *  // Final method cannot override
	@Override
	public void method1() {
		System.out.println("Method-1 in sub class");
	}
	*/
	
	/*
	public static void StaticMethod(String w) {
		System.out.println("Sttaic method in sub class");
	}
	
	*/
}
