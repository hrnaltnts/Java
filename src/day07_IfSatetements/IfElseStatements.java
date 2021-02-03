package day07_IfSatetements;

public class IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=70;
		
		
		if(score>=70) {
			System.out.println("that is good");
			++score;
			System.out.println(score);
			
		} 
		else {
			System.out.println("you failed");
			System.out.println(score);
		}

	}

}
