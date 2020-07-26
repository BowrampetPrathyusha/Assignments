package assignment3;
import java.util.Scanner;

public class AccountTest {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	Account account=new Account();
	System.out.println("Enter present balance ");
	double balance=sc.nextDouble();
	account.setInitBalance(balance);
	System.out.println("Enter deposit amount");
	double depositAmount=sc.nextDouble();
	account.deposit(depositAmount);
	System.out.println("Enter withdrawl amount");
	double withdrawAmount=sc.nextDouble();
	account.withdraw(withdrawAmount);
	if(withdrawAmount>balance) {
		System.out.println("Insufficient balance");
		
	}
		else {
			System.out.println("Final Amount: "+account.getInitBalance());
		}
	sc.close();
	
	
		
	}
	

}
