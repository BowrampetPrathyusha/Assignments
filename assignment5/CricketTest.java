package assignment5;
import java.util.*;
public class CricketTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Target Runs: ");
		int targetScore=sc.nextInt();
	
		System.out.println("Enter Current Over: ");
		int currentOver=sc.nextInt();
		System.out.println("Enter Current Score: ");
		int currentScore=sc.nextInt();
		
	Cricket cricket=new OneDayCricket();
	cricket.setTargetScore(targetScore);
	cricket.setCurrentScore(currentScore);
	cricket.setCurrentOver(currentOver);
	System.out.println("Current Run Rate: "+cricket.calCurrentRunRate());
	System.out.println("Required Run Rate: "+cricket.calReqRunRate());
	sc.close();
}
}
