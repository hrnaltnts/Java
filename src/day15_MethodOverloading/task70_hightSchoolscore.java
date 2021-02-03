package day15_MethodOverloading;

public class task70_hightSchoolscore {
	
	public static void main(String[] args) {
		
		int x=calculateHighScorePosition(300);
		
		displayHighScorePosition("Mike", x);

	}
	
	public static void displayHighScorePosition (String playerName, int highScorePosition) {
		System.out.println(playerName+" managed to get into position "+highScorePosition+" on the high score position");
	}
	
	private static int calculateHighScorePosition(int playerScore) {
		if(playerScore>=1000) {
		return 1;
	}else if (playerScore>=500 && playerScore<1000) {
		return 2;
	}else if (playerScore>=100 && playerScore<500) {
		return 3;
	}else {
		return 4;
	}

}
}