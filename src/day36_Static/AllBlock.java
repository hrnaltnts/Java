package day36_Static;

public class AllBlock {
	
	public AllBlock(int x) {
		System.out.println("One Argument Constructor");
	}
	
	public AllBlock() {
		System.out.println("No argument constructor");
	}
	
	static {
		System.out.println("Firsrt Static Init");
	}
	
	{
		System.out.println("First Instnce Init");
	}
	
	{
		System.out.println("Second Instance Init");
	}
	
	static{
		System.out.println("Second Static Init");
	}

}