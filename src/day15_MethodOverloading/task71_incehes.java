package day15_MethodOverloading;

public class task71_incehes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			calcFeetAndInchesToCentimeters(100);
			
		}

		
		
		public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
			
			if (feet<0 ||(inches<0|| inches>12)) {
				System.out.println("invalid feet or inches");
			
			return -1;
		}
			double centimeters= (feet*12)*2.54 + (inches*2.54);
			
			System.out.println(feet + " feet" + inches + " inches=" + centimeters + " centimeters");
			
			
			return centimeters;
		}
		public static double calcFeetAndInchesToCentimeters(double inches) {
			
			if (inches<0) {
				return -1;
			}	
				double feet= (int)inches/12;
				double remainigInches=inches%12;
			
			System.out.println(inches + " inches" + feet + " feet and" + remainigInches + " inches");
			
			return calcFeetAndInchesToCentimeters(feet,remainigInches);
		}

	}


