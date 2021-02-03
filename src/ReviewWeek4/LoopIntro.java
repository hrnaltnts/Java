package ReviewWeek4;

public class LoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	below isinfinitive loop stiation because 10 is forever more than 0
		
	//	int x=10;
	//	while(x>0) {
	//		System.out.println("do something here");
	//	}
		
		//count from 0 to 10 in 3 type of loops we learned
		
		
		// WHILE
		int x=0;
		
		while (x<= 10) {
			System.out.println(x+ " ");
			x++;
			
		}// DO WHILE
		
		int y =0;
		
		do {
			
			System.out.println(y+ "");
			y++;
		} while (y<=10) ;
		
		
		//FOR 
		
		for(int k=0; k<=10; k++) {
			
			System.out.println(k);
		}

	}

}
