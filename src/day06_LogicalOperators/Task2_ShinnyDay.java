package day06_LogicalOperators;

public class Task2_ShinnyDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String OutsideWeather;
		int Degree;
		OutsideWeather="Shinny";
		Degree=70;
		
		boolean comp=(!(OutsideWeather=="Rainy"||Degree==70));
		//(!(f||t)= !t ==f
		
		
		System.out.println(comp);

	}

}
