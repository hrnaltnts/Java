package day09_summaryOfflowStatements;

public class OrLogicwithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'D';
		
		switch(grade) {
		case 'A':
			System.out.println("pass");
			break;
		case'B':
			System.out.println("Pass");
			break;
		case'C':
			System.out.println("Pass");
			break;
		case'D':
			System.out.println("FAIL");
			break;
		case'E':
			System.out.println("FAIL");
			break;//
			
		}
		switch(grade) {
		case'A':case'B':case'C':
			System.out.println("pass");
		case 'D': case 'E':
			System.out.println("FAIL");
		}
	}

}
