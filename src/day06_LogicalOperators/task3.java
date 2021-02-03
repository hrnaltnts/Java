package day06_LogicalOperators;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=2;
		boolean res= ++b == 2||--b ==2 &&--b==2;
		//b in memory :2->3->2->1
		// res        :3==2||2==2&&1==2;// f||t && f// t && f =f
		
		
		System.out.println(res);

	}

}
