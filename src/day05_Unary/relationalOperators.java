package day05_Unary;

public class relationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=1;
		byte b2=2;
		double d1 =3.5;
		int i1= 17;
		float f1= (float)67.0;
		
		boolean test1 =b1<b2;
		System.out.println(test1);// true
		
		boolean test2 =b1>b2;
		System.out.println(test2);//false
		
		boolean test3 =d1==b1;
		System.out.println(test3);//false
		
		boolean test4 =d1!=b1;
		System.out.println(test4);//true
		
		boolean test5 =(i1*d1)>=(f1-42);//true
		System.out.println(test5);
		//= assigment operators
		// == relational operators (all relational operators  are boolean)
		System.out.println((6*4)<=(3*8));//true
		
		
		System.out.println('a'<'b');//true

	}

}
