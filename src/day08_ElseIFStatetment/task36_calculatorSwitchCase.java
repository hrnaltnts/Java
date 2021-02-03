package day08_ElseIFStatetment;

public class task36_calculatorSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		String operator="+";
		int result=0;
		
		switch(operator) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1+num2;
			break;
		case"*":
			result=num1*num2;
			break;
		case"/":
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		System.out.println("Result is "+ result);

	}

}
