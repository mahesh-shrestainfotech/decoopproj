package oopproj;

//derived class or child class or sub class 
public class JuniorSavingsAccount extends SavingsAccount{
	String gaurdianName;	
	public JuniorSavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public JuniorSavingsAccount(int accountNo, float balance, int pin, String gaurdianName) {
		super(accountNo, balance, pin);
		this.gaurdianName = gaurdianName;
	}	// TODO Auto-generated method stub
	
	//withdraw(int,int)
	public void withdraw(int pin, int withdrawalAmount) {
		if(isPinValid(pin)) {			
			if(withdrawalAmount <= 1000) {				
				withdraw(withdrawalAmount);				
			}else {
				System.out.println("Withdrawal Limit exceeded..");
			}			
		}else {
			System.out.println("Invalid pin..");
		}
	}
	
	
	
}
