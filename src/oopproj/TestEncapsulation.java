package oopproj;

public class TestEncapsulation {

	public static void main(String[] args) {

		SavingsAccount account = new SavingsAccount(101,5000,1234);
		
		account.deposit(1000);
		
		
		System.out.println(account.getBalance());

	}

}
