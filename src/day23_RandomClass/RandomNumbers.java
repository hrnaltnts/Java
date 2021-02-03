package day23_RandomClass;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn= new Random();
		
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());
		
		System.out.println(rn.nextFloat());
		
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50));//0-49
		
		System.out.println(rn.nextInt(10)+5); // 5 - 14

	}

}
//-473439349
//0.961600855112438
//0.1519748
//true
//13
