package oopproj;

public class TestInheritance {

	public static void main(String[] args) {
		
		JuniorSavingsAccount account = new JuniorSavingsAccount(101,5000,2345,"Hary");
		
//		account.accountNo = 101;
//		account.balance = 5000;
//		account.pin = 2345;
//		account.gaurdianName = "Hary";
		
		account.deposit(500);
		
		System.out.println("AccountNo : "+account.getAccountNo());
		System.out.println("Balance   : "+account.getBalance());
		System.out.println("GuardianName : "+account.gaurdianName);
		

	}

}
