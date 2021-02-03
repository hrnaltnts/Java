package Assignment6_NestedForLoop;

public class Question2_reverseRighttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int peekNumber=7;

		upper:
        for(int i =peekNumber; i>=1; i--) {
        
        	for(int j=1; j<=i; j++) {
        		System.out.print(j);
        		if(i==1) {
        			break;
        		}
        		}
        			System.out.println();
			
		}

		lower:		
		for(int i =1; i<=peekNumber; i++) {

			for(int j=1; j<=i; j++) {
				System.out.print(j);
					}
					System.out.println();
					
				}
		
			
			


	}

}


//
//1234567
//123456
//12345
//1234
//123
//12
//1
//1
//12
//123
//1234
//12345
//123456
//1234567

