package Assignment6_NestedForLoop;

public class Question4_010101patter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n=7;
		
             for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
            	 
             if (j % 2 == 1) {
             System.out.print("1 ");
             } else {
             System.out.print("0 ");
             }
             }
             System.out.println();
             }
             
	}

}

//1 
//1 0 
//1 0 1 
//1 0 1 0 
//1 0 1 0 1 
//1 0 1 0 1 0 
//1 0 1 0 1 0 1 
 