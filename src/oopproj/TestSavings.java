package oopproj;

public class TestSavings {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount(101,5000,1234);

//		account.accountNo = 101;
//		account.balance = 5000;
//		account.pin = 1234;
		
		             //argument
		account.deposit(1000);
		
		System.out.println("AccountNo : "+account.getAccountNo());
		System.out.println("Balance   : "+account.getBalance());
		
		
		System.out.println("Minimum Balance : "+SavingsAccount.minimumBalance);
		
		SavingsAccount account2 = new SavingsAccount(102,10000,2345);
		
		account2.deposit(500);
		
		account2.withdraw(2345,1000);
		
//		account2.accountNo = 102;
//		account2.balance = 10000;
//		account2.pin = 2345;
		
		System.out.println("AccountNo : "+account2.getAccountNo());
		System.out.println("Balance   : "+account2.getBalance());
	}

}
