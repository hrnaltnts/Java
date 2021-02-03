package day08_ElseIFStatetment;

public class ifElseIFelse {

	public static void main(String[] args) {
		//Program to display days
		
		int day=1;
		
		if(day==1) {
			System.out.println("Monday");
		} else if(day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday");
		}else if(day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}
		
		System.out.println("******************************************");
		
		int age=17;
		
		if (age<2||age>18) {
			System.out.println("ineligble");
		}else if(age>=3 && age<=10) {
			System.out.println("toddler");
		}else if(age==6 || age==7) {
			System.out.println("young reader");
		}else if(age>=8 && age<=10) {
			System.out.println("elementeray");
		}else if (age==11 || age==12) {
			System.out.println("middle");
		}else if(age==13) {
			System.out.println("impossible");
		} else if(age>=14 && age<=16) {
			System.out.println("high school");
		} else if (age==17 || age==18) {
			System.out.println("scholar");
		} else {
		System.out.println("not valid age");
		}
		
 }
	
}

