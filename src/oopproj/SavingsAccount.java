package oopproj;

//This is a SavingAccount class.
//base class or parent class or super class
public class SavingsAccount {
	
	//fields or instance variables
	private int accountNo;
	private float balance;
	private int pin;
	//static variables
	final static int minimumBalance=500;
	
	//default constructor
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	                    //parameters
	public SavingsAccount(int accountNo, float balance, int pin) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.pin = pin;
	}
	
	public boolean isPinValid(int pin) {
		if(this.pin == pin) return true;
		return false;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}

	//static method
	public static int getMinimumbalance() {
		return minimumBalance;
	}
	
	public void printDetails() {
		System.out.println("AccountNo : "+accountNo);
		System.out.println("Balance   : "+balance);
	}

   //instance methods or non-static method
					//parameter
	//deposit(int)
	public void deposit(int amount) {
		//System.out.println(minimumBalance);
		if(amount > 0) {
			this.balance = this.balance + amount;
		}else {
			System.out.println("Invalid deposit amount");
		}
	}	
	
	//withdraw(int)
	   //instance methods  or non-static method
						//parameter
	public void withdraw(int withdrawalAmount) {
		if(withdrawalAmount <= balance) {
			balance = balance - withdrawalAmount;
		}else {
			System.out.println("U Have Insufficient Funds...");
		}
	}
	
	//withdraw(int,int)
	public void withdraw(int pin,int withdrawalAmount) {
		if(this.pin == pin) {			
			if(withdrawalAmount <= 4000) {				
				withdraw(withdrawalAmount);				
			}else {
				System.out.println("Withdrawal Limit exceeded..");
			}			
		}else {
			System.out.println("Invalid pin..");
		}
	}

}
