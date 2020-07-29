package assignment7;	
import java.util.*;

public class TestScoreAnalyser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ScoreAnalyser score=new ScoreAnalyser();
		System.out.println("enter no.of scores: ");
		int scores=sc.nextInt();
System.out.println("enter runs");
		
		for (int i = 0; i < scores; i++) {
			
			score.addRunsToList(sc.nextInt());
		}

		score.displayRuns();
		System.out.println("Runrate :" + score.calcRunRate()+"\t");
		System.out.println("Lowest Runs :" + score.lowestRunsScored());
		System.out.println("Count of players who batted :" + scores);

	sc.close();
	}
		
		
		

	}


