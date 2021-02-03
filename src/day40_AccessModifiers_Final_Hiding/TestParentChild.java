package day40_AccessModifiers_Final_Hiding;

public class TestParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child s = new Child();
		System.out.println("Value of x before increement "+ s.x);
		s.increment();
		System.out.println("Value of x after increement "+ s.x);
		
		
		Parent p= new Parent();
		System.out.println("Value of x before increement "+ p.x);
		
		p.increment();
		System.out.println("Value of x after increement "+ p.x);
		
		

	}

}
//
//Value of x before increement 200
//Value of x after increement 200
//Value of x before increement 100
//Value of x after increement 101
//
