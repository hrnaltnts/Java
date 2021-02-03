package Assignment6_NestedForLoop;

public class Question6_increasedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9
				;
		for (int i=0; i<n;i++ )
		{
			
			for (int j=0;j<n ;j++ )
			{
				if (j<=i)
				{
					System.out.print((((2*n-1-j)*j)/2)+(i+1)+" ");
				}
			}
			System.out.println();
		}
	}

	}// i found this solution on internet

//1 
//2 10 
//3 11 18 
//4 12 19 25 
//5 13 20 26 31 
//6 14 21 27 32 36 
//7 15 22 28 33 37 40 
//8 16 23 29 34 38 41 43 
//9 17 24 30 35 39 42 44 45 
