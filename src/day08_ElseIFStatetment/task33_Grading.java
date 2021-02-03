package day08_ElseIFStatetment;

public class task33_Grading {

	public static void main(String[] args) {
		int mark=100;
		
		if(mark<60) {
			System.out.println();
		}else if(mark>=60&&mark<90) {
			System.out.println("pass");
		}else if(mark>90) {
			System.out.println("Passed with distinction");
		}else {
			System.out.println("invalid score");
		}

	}

}
