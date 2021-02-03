package day17_UserfInput;

public class BankAccountObjects {

	public static void main(String[] args) {
		
		BankAccount acc1= new BankAccount();
		
		acc1.accountHolder= "Mike Smith";
		acc1.accountNumber =12345;
		
		acc1.deposit(250);
//		depositing $ 250.0 to 12345
		acc1.showBalance();
//		--------
//		account holder: Mike Smith
//		account number: 12345
//		balance: $250.0
//		--------
		acc1.withdraw(100);
//		withdraing $ 100.0 from 12345
		acc1.showBalance();
//		--------
//		account holder: Mike Smith
//		account number: 12345
//		balance: $150.0
//		--------
		acc1.charge(50, "table");
		
//		buying table for $ 50.0 from 12345
		
		acc1.showBalance();
		
//		--------
//		account holder: Mike Smith
//		account number: 12345
//		balance: $50.0
//		--------
		

	}

}
