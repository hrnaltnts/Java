package day04_aritmaticOperators;

public class additionConcet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number + number :addition
		System.out.println(2+2);
		System.out.println(20+200);
		
		//number + String: Concetenation
		System.out.println(5+"hello");//5hello
		
		System.out.println("hello"+ true);
		
		System.out.println("hello"+"world");
		
		System.out.println((2+0+3+"Cybertek"));//5Cybertek
		System.out.println("Cybertek"+2+0+5);//Cybertek205 ==>look line 12; mean it is concetenation
		System.out.println(2+0+5+"Cybertek"+2+0+5);//7Cybertek205
		System.out.println(2+0+5+"Cybertek"+(2+0+1));//7Cybertek3
		
		
	}

}
