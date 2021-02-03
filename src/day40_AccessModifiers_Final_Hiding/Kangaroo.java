package day40_AccessModifiers_Final_Hiding;

public class Kangaroo extends Masupial {
	
	public boolean isBiped() {
	return true;

}

public void getKangarooDesciription () {
	System.out.println("Kangaroo hops on two legs:"+ isBiped());
}
}