package day06_LogicalOperators;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1='A';
		char c2=65;
		int i1=5;
		int i2=10;
		
		boolean res1=(i1==i2)&(c1==c2);// f & T =F
		boolean res2=(i1==i2)&&(c1==c2++);// F && --- =F
	
		
		System.out.println("res1= "+res1);
		System.out.println("res2= "+res2);
		
		boolean res3=!(c1==c2)&(i1==i2);//T|F=T
		boolean res4=!(c1==c2)&&(i1==++i2);//T||---- =T //
		System.out.println("i2="+i2);
		
		System.out.println("res3= "+res3);
		System.out.println("res4= "+res4);
		
		boolean res5= (c1==c2)^(i1==i2);//T^F =T
		boolean res6= (c1==c2)^(i1!=i2);//T^T =F
		
		System.out.println("res5= "+res5);
		System.out.println("res6= "+res6);

				
	}

}
