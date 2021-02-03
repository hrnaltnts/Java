package Assignment5_ForLoop;

public class Question11_nestedIfreverseTriangle {

	public static void main(String[] args) {
		
		int rows=4;
		
		
		for(int i =rows; i>=1; i--) {
			
			for(int j=rows; j>i; j--) {
				System.out.print(" ");
				}
				
			for(int z=i; z>=1; z--) {
				System.out.print(+z+" ");
				
			}
			System.out.println();
		}
		

	}

}
