package day05_Unary;

public class task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		int y= x*4-x++;
		
		// x in memory  :4->5
		// y			:4*4-4 =12
		System.out.println(y);

	}

}
