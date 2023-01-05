package oopproj;

public class TestReference {

	public static void main(String[] args) {

		SavingsAccount account = new JuniorSavingsAccount(101, 5000, 1234, "Hary");
		
		account.withdraw(1234, 1000);
		
		//account.printDetails();
		
		JuniorSavingsAccount juniorSavingsAccount = (JuniorSavingsAccount)account;

	}

}
