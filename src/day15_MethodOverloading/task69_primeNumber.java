package day15_MethodOverloading;

public class task69_primeNumber {

	public static void main(String[] args) {
		// 0 and 1 not prime number
		// 2 is prime number
		// 3
		// 4/2not prime
		// 5
		// 6/2 6/3
		// 7/2 
		if(isPrime(36)) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}
	}
		
		private static boolean isPrime(int number) {
		
		boolean flag =true;
		if(number==0 ||number==1) {
			flag=false;
		}else {
			
			for(int i=2;i<=number;number++) {
				if(number%i==0) {
					flag=false;
					break;
				}
				
		}

		}
		return flag;

		

	}
	
		}
