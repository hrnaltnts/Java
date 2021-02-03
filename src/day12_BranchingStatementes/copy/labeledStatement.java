package day12_BranchingStatementes.copy;

public class labeledStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		outer:
			do {
				i=8;
				inner:
				while(true) {
					System.out.println(i--);
					if(i==4) {
						break outer; //if write inner output would be infinitive
					}
				}
			} while(true);

	}

}


//8
//7
//6
//5

