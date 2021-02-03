package day06_LogicalOperators;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ApplesCount=20;
		int OrangesCount=30;
		int PearsCount =30;
		
		
		boolean comp= ApplesCount <OrangesCount||OrangesCount>=PearsCount;
		//20<30||20>=30 = T|| ----- T
		
		System.out.println(comp);

	}

}
