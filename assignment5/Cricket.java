package assignment5;

public abstract class Cricket {
	private int maxOvers;
	private int targetScore;
	private int currentOver;
	private int currentScore;
	public int getMaxOvers() {
		return maxOvers;
	}
	public void setMaxOvers(int maxOvers) {
		this.maxOvers = maxOvers;
	}
	public int getTargetScore() {
		return targetScore;
	}
	public void setTargetScore(int targetScore) {
		this.targetScore = targetScore;
	}
	public int getCurrentOver() {
		return currentOver;
	}
	
	
	public int getCurrentScore() {
		return currentScore;
	}
	public abstract double calCurrentRunRate();
	public abstract double calReqRunRate();
	public Cricket() {
		maxOvers=50;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore=currentScore;
		// TODO Auto-generated method stub
		}
	public void setCurrentOver(int currentOver) {
		this.currentOver=currentOver;
		// TODO Auto-generated method stub
		}
	
	

}
