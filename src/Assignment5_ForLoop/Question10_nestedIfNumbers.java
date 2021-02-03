package Assignment5_ForLoop;

public class Question10_nestedIfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=7;
		int colums=6;
		
		for(int i =1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
