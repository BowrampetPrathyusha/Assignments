package assignment3;

public class Account {
	double initBalance;
	

	public double getInitBalance() {
		return initBalance;
	}

	public void setInitBalance(double initBalance) {
		this.initBalance = initBalance; 
		
	}

	public void deposit(double depamount) {
		this.initBalance=initBalance+depamount;
		System.out.println("Balance is "+this.getInitBalance());
	}
	public void withdraw(double withamount) {
		this.initBalance=initBalance-withamount;
		if(this.initBalance>withamount) {
			System.out.println("Amount is not sufficient");
		}
		else {
		System.out.println("Balance after withdrawl "+this.getInitBalance());
	}
	}

		
}	
		
