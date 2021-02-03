package day11_NestedFor_Loop;


public class forLoopRules {

	public static void main(String[] args) {
		//1- Creating an infinitive loop
		//components of the for loop are ech optional
		
		//for( ; ; ) {
			//System.out.println("Hello");//ENDLESSS
		//}
		//int i=4;
		//for( ; i<=5;i++) {
		//	System.out.println(i);// OK 1 2 3 4 5
		//}
			//for( ; ;i++) {
		//		System.out.println(i);//ENDLESS
		//}
		  // for( ; i<=5;){
			//   System.out.println(i);//ENDLESS 1 1 1 1 1 1
		  // }
		
		
		//2- Adding Multiple Term to the for statement 
		//	int x=0;
		//	for(long y=0, z=4; x<5 | y>10 ; x++,y++) {
		//		System.out.println(y + " ");
				
		//	}
			
		
		//3- Redeclaring a variable in the init block
		//int x=0;
		
		//for(long y=0, z=2 ; x<5 && y<10 ; x++, y++) {
			//System.out.print(y+ " ");
		//}
		//System.out.println(x);
		
		//4- Using incompatiable data types in the init block
		//the variables in the init block must all be of the same data type
		
		//for (long y=0, int x=0; x<5 && y<10; x++, y++) {// doednt combile
		//	 System.out.println("Hello");
		//}
		
		//5- Using loop variable outside of the loop
		 //for(long y=0, x=0 ; x<5 && y<10 ; x++, y++) {
		//	System.out.print("Hello");
		 // }
		 // System.out.println(x);// out side of for's "}"doesnt compile
		}

}
