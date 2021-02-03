package day08_ElseIFStatetment;

public class task35_FindGreatestNumberNested {

	public static void main(String[] args) {
		
		int n1=1000;
		int n2=10000;
		int n3=100; 
		
		if(n1<n2 && n1>n3) {
			System.out.println("n1 is biggest one");
		}else {
			if(n2>n3 ) {
				System.out.println("n2 is biggest one");
			}else {
				System.out.println("n3 is biggest one");
			}
		}
	}}		



