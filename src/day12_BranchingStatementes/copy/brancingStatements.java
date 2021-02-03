package day12_BranchingStatementes.copy;

public class brancingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		
		while(number<15) {
			number++;
			if(number<=5) {
				System.out.println("Skipping number" + number);
				continue;// if this would be break output Skipping number1
			}
			System.out.println("number= "+number);
			if(number>=10) {
				System.out.println("Breaking at "+number);
				break;
			}
		}

	}

}                                         //without just CONTINUE
// with CONTINUE and BREAK                //Skipping number1
//Skipping number1                        //number= 1
//Skipping number2                        //Skipping number2
//Skipping number3                        //number= 2
//Skipping number4                        //Skipping number3
//Skipping number5                        //number= 3
//number= 6                               //Skipping number4
//number= 7                               //number= 4
//number= 8                               //Skipping number5
//number= 9                               //number= 5
//number= 10                              //number= 6
//Breaking at 10                          //number= 7
                                          //number= 8
                                          //number= 9
                                          //number= 10
                                          //Breaking at 10


//without CONTINUE and BREAK                without just BREAK
//Skipping number1                         Skipping number1
//number= 1                                Skipping number2
//Skipping number2                         Skipping number3
//number= 2                                Skipping number4
//Skipping number3                         Skipping number5
//number= 3                                number= 6
//Skipping number4                         number= 7
//number= 4                                number= 8
//Skipping number5                         number= 9
//number= 5                                number= 10
//number= 6                                Breaking at 10
//number= 7                                number= 11
//number= 8                                Breaking at 11
//number= 9                                number= 12
//number= 10                               Breaking at 12
//Breaking at 10                           number= 13
//number= 11                               Breaking at 13
//Breaking at 11                           number= 14
//number= 12                               Breaking at 14
//Breaking at 12                           number= 15
//number= 13                               Breaking at 15
//Breaking at 13
//number= 14
//Breaking at 14
//number= 15
//Breaking at 15





