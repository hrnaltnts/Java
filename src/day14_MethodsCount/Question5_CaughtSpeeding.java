package day14_MethodsCount;

public class Question5_CaughtSpeeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coughtSpeeding(60, false);

	}

	private static void coughtSpeeding(int speed, boolean isBirthday) {
		// TODO Auto-generated method stub
		if (isBirthday) {
			if(speed<=65) {
				System.out.println(0);
			}else if(speed>=66 && speed<=85) {
				System.out.println(1);			
			}else if(speed>86) {
				System.out.println(2);
			}
		}else {
			if (speed<=60) {
				System.out.println(0);					
			}else if(speed>=66 && speed <=80) {
				System.out.println(1);
			}else if(speed>=81) {
				System.out.println(2);
			}
		}
		
	}
	

}
