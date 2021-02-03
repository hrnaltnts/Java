package day13_Method;

public class CreditCard {

	public static void main(String[] args) {
		double salary=50000;
		int creditRating=;
		
		if(salary>=20000 &&creditRating>=7) {
			qualify();
//first u write from here and then use the shortcut clipce´s
		}else {
			noQualify();
		}

	}

	private static void noQualify() {
	
		System.out.println("not qualified");
	}

	private static void qualify() {
		
		System.out.println("qualified");
		
	}

}
