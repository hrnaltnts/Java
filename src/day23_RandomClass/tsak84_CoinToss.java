package day23_RandomClass;
import java.util.*;

public class tsak84_CoinToss {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn =new Random ();
		
		for(int i=0; i<10;i++) {
			if (rn.nextInt(2)==0) {
				System.out.println("Tails");
			}else {
				System.out.println("Head");
			}
		}
	}

}

