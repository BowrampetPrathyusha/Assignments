package assignment3;

public class GiftCard {
	private long cardNo;
	private double balance;
	private boolean active;
	
	public GiftCard(long cardNo,double balance,boolean active) {
		super();
		this.cardNo=cardNo;
		this.balance=balance;
		this.active=active;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	public GiftCard() {
	super();
	this.balance=0.0;
	this.active=true;
	}
	public void rechargeCard(int amount) {
		if(active==true) {
			this.balance=balance+amount;
			System.out.println("Successful");
		}
	}
	public void swipeCard(double amount) {
		if (this.active==true) {
			if(this.balance>=amount) {
				this.balance=balance-amount;
				System.out.println("Money deducted");
			}
			else {
				System.out.println("Insufficient amount");
			}
		}
	}
	
	
	
	
	

}
