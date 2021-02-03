package day11_NestedFor_Loop;

public class task53_oddNumberwhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sumEven=0;
		
		while(i<100) {
			if(i%2==0) {
				sumEven=sumEven + i;
				
			}
			i++;
		}
		System.out.println(sumEven);
	}

}
