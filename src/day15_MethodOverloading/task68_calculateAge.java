package day15_MethodOverloading;

public class task68_calculateAge {

	public static void main(String[] args) {
		
		yearUnitRetirement("Mike",1990);

	}
	public static int calculateAge(int yearBirth) {
		return 2020-yearBirth;
	}

	private static void yearUnitRetirement(String name, int year) {
		
		int retirementAge=65-calculateAge(year);
		
				System.out.println(name +" retires in "+retirementAge+" years");
	}

}
