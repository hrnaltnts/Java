package day17_UserfInput;

public class BankAccount {

	
		double balance;
		String accountHolder;
		int accountNumber;
		
		public void deposit(double amount) {
			System.out.println("depositing $ "+ amount+ " to "+accountNumber);
			balance+=amount;
		}
		
		public void withdraw (double amount) {
			System.out.println("withdraing $ "+amount+ " from "+accountNumber );
			balance-=amount;
			
			if (balance<0) {
				balance=35;
			}
		}
		
		public void showBalance () {
			System.out.println("--------");
			System.out.println("account holder: "+accountHolder);
			System.out.println("account number: "+accountNumber);
			System.out.println("balance: $"+balance);
			System.out.println("--------");
		}
		
		public void charge(double price,String item) {
			if (balance>=price) {
				System.out.println("buying "+item+" for $ "+price+" from "+accountNumber );
				balance=price;
			}else {
				System.out.println("in sufficent funds to purchase "+item+" from "+accountNumber );
			}
			
			
		}

	

}
