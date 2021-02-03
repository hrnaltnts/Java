package day11_NestedFor_Loop;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			System.out.println("Outer Loop Iteration "+i);
			for (int j=1; j<=2;j++) {
				System.out.println("i= "+i+"; j="+j);
				//Outer Loop Iteration 1
				//i= 1; j=1
				//i= 1; j=2
				//Outer Loop Iteration 2
				//i= 2; j=1
				//i= 2; j=2
				//Outer Loop Iteration 3
				//i= 3; j=1
				//i= 3; j=2
				//Outer Loop Iteration 4
				//i= 4; j=1
				//i= 4; j=2
				//Outer Loop Iteration 5
				//i= 5; j=1
				//i= 5; j=2
				
				
			}
		}
		

	}

}
