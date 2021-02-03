package day10_TernaryOperator_For_Loop;

public class task44_SpeedConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		
		int kph;
		double mph;
		System.out.println("KPH             MPH");
		
		for(kph=STARTING_KPH;kph<=MAX_KPH;kph+=INCREMENT){
			mph=kph*0.6214;
			
			System.out.println(kph + "\t\t" + mph);
					
		}

	}

}
