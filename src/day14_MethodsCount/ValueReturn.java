package day14_MethodsCount;

public class ValueReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(sum(2,3));// it is works
		
		sum(2,3);// it work
		//  5
		
		//System.out.println(result); //it doesnt combile
		
		// below one is work 
		int v1=sum(2,5);
		System.out.println("v1 "+v1);
		//v1 7
		
		
		//int number =result;// it doesnt combile
		//System.out.println(number);// dont combile because of it is local

	}

	private static int sum(int i, int j) {
		
		int result;//local variable
		result=i+j;
		System.out.println("all time inside method "+result);// it is work
		
		return result;
		//without return it doesnt work
		
		
	}

}
