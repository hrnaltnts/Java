package assigment3_aritmaticOperators;

public class Question5_Clock {
	public static void main(String[] args) {
		int hours, minutes, seconds,inputSeconds=25291;
		minutes=inputSeconds/60;
		seconds=inputSeconds%60;
		hours=minutes/60;
		minutes=minutes%60;
		
		System.out.println(hours+"hours "+minutes+"minutes "+seconds+"seconds");
		
	}

}
