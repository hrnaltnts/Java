package day05_Unary;

public class task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 1;
		a= -a-- + a++ /-a--*--a;
		// a in memory 1 ->0 -> 1->0->-1
		// result -1 + 0/-1*1
		System.out.println(a);

	}

}
