package assignment3;

public class GiftCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiftCard gift=new GiftCard(123,0.0,true);
		gift.rechargeCard(2000);
		System.out.println("Balance is : "+gift.getBalance());
		gift.swipeCard(500);
		System.out.println("New Balance is : "+gift.getBalance());
		gift.swipeCard(400);
		System.out.println("New Balance is : "+gift.getBalance());
		
		GiftCard gift1=new GiftCard(123,0.0,true);
		gift1.rechargeCard(3000);
		System.out.println("Balance is : "+gift1.getBalance());
		gift1.swipeCard(500);
		System.out.println("New Balance is : "+gift1.getBalance());
		gift1.swipeCard(2700);
	
		
		

	}

}
