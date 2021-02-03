package ReviewWeek4;

public class LoopCaontrolStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BREAK:breaking out of the loop early
		for (int i=1; i<=10; i++) {
			System.out.println(i+" ");
			if(i==5) {
				System.out.println("I am gonna break right here!!");
				break;
			}
		}
		
		
		
		//CONTINUE:skip the current iteration
		
		for( int i=1; i<=10;i--) {
			
			if(i==5) {
				System.out.println(" i will justsjip this one");
				continue;
			}
			System.out.println(i);
			}
			System.out.println();
		
		}
		

	}


