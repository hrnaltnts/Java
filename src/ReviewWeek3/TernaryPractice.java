package ReviewWeek3;

public class TernaryPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String amORpm= "";
		int hour= 11;
		
		if(hour>12) {
			amORpm= "PM" ;
		}else {
				amORpm="AM";
		}
		//SYSTAX TERNARY OPERATOR
		//DataType variableName=(condition here) ? IfTrueAssignThis : IfFalseAssignThis;
		//String amORpm =(hour>12) ? "PM" ; "AM" ;
		//ADDING LESS THAN 24 FOR CONDITION
		String AMorPM = (hour>12 && hour<24) ? "PM" : "AM" ;
		System.out.println("IT IS:"+AMorPM);
		
		int num1=10;
		int num2=20;
		
		int biggerNumber=0;
		
//		if(num1>num2) {
			
//			biggerNumber=num1;
			
//		}else if (num2>num1) {
			
//			biggerNumber=num2;
			
//		} same process with Ternary
			biggerNumber=(num1>num2) ? num1  :num2 ;
			System.out.println("BIGGER NUMBER IS " +biggerNumber);
		

	}

}
