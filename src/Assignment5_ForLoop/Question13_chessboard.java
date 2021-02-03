package Assignment5_ForLoop;

public class Question13_chessboard {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int rows=8;
		int colums=4;
		
		for(int i =1; i<=rows; i++) {
			for(int j=1; j<=colums; j++) {
				if (i%2!=0) {
				System.out.print("W");
				System.out.print("B");
			}else {
				System.out.print("B");
				System.out.print("W");
			}}
			
			System.out.println();
		}

	}

}
