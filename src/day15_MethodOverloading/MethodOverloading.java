package day15_MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("ikili "+sum(3,4));
		System.out.println("uclu "+sum(3,2,1));
		
		int x=sum(20,30,40,50);
		System.out.println(x);

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}
	
	public static int sum(int a, int b,int c, int d) {
	return a+b+c+d;
}

}

/* 
1- Number of paremeters
add(int,int)
add(int,int,int)

2- Data Type ofParameters
add(int,int )
add(int,float)

3-Seqence of data type parameters
add(int,float)
add(float,int)

4-Invalid Case -!!not overloading!!
int add(int,int)
float add(int,int)

*/

