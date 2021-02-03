package day05_Unary;

public class task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int result=--a + a++ + a-- + a++;
		
		//a in memory 50 -49 -40 -49 - 50
		// result 49 + 49 + 50 + 49
		
		System.out.println(result);		
	}

}
