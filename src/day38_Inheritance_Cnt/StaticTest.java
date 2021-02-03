package day38_Inheritance_Cnt;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticSub obj = new StaticSub();
		obj.num=5;
		obj.print();
		
		StaticSuper.num=10;
		obj.print();
		System.out.println(StaticSub.num);
		
		//StaticSub.m2();  error because m2 doesn't static.
		
		obj.m2();

	}

}


//5
//10
//10
//StaticSuper.m2() called
