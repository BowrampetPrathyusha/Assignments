package assignment7;
import java.util.*;
public class ScoreAnalyser {
	private LinkedList<Integer> runsData= new LinkedList<Integer>();
	
	public ScoreAnalyser(LinkedList<Integer> runsData) {
		
		super();
		this.runsData = runsData;
		
	} 
	
	void addRunsToList(int runs)
	{
		runsData.add(runs);
	}
	double calcRunRate()
	{
		
		int total=0;
		for(int i=0;i<runsData.size();i++)
		{
			 total= total+runsData.get(i);
			
		}
		return  total/50;
	}
	public double lowestRunsScored() {
		return (Collections.min(runsData));
	}
	public void displayRuns() {
		for(int i : runsData) {
			System.out.println(runsData.indexOf(i)+"-"+i);
		}	
		}
		public ScoreAnalyser(){
	}
}
