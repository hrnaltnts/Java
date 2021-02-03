package day14_MethodsCount;

public class Question4_deerPlay {
	/*
	 * The deeers in va speed most of the day playing. in particular
	 * they play if the temperature is between 60 and 90. Unless if it is
	 * summer, then the upper limit is 100 instead of 90
	 * Write a method that accepts temperature and boolean isSummer,
	 * prints true if the deers play and false otherwise.
	 * 
	 * deerPlay(70, false);  true
	 * deerPlay(95, false); false
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deerPlay(95, false);
	}

	private static void deerPlay(int temp, boolean isSummer) {
		
		if(isSummer) {
			if(temp>60 && temp<100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(temp>60 && temp<90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
				
		}
		
	}

}
