package day14_MethodsCount;

public class Question1_sytingTimes {
	/*write a method that accept a string a non negative number,
	 * and prints a larger string that is number copies of original
	 * String
	
	stringTimes("Hi",2); =>HiHi
	stringTimes("Hi",3); =>HiHiHi
	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringTimes("Hi",6);

	}

	private static void stringTimes(String string, int number) {
		
		String str="";
		for(int i=0; i<number;i++) {
			str=str + string;
		}
		System.out.println(str);
	}

}
