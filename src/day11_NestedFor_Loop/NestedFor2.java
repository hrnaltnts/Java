package day11_NestedFor_Loop;

public class NestedFor2 {

	public static void main(String[] args) {
		
		for (int i0;i<=3;i++) {
			System.out.println("Outer= Loop at state:"+ i);
			for(int p=0; p<=3;p++) {
				System.out.println("Inner loop at state:"+ p);
				if(p==3) {
					System.out.println("lets look after 3");
				}
			}
		}
		//Outer Loop at state:0
		//Inner loop at state:0
		//Inner loop at state:1
		//Inner loop at state:2
		//Inner loop at state:3
		//lets look 3
		//Outer Loop at state:1
		//Inner loop at state:0
		//Inner loop at state:1
		//Inner loop at state:2
		//Inner loop at state:3
		//lets look 3
		//Outer Loop at state:2
		//Inner loop at state:0
		//Inner loop at state:1
		//Inner loop at state:2
		//Inner loop at state:3
		//lets look 3
		//Outer Loop at state:3
		//Inner loop at state:0
		//Inner loop at state:1
		//Inner loop at state:2
		//Inner loop at state:3
		//lets look 3


	}

}
