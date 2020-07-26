package assignment5;

 class OneDayCricket extends Cricket {
	public  double calCurrentRunRate() {
	return getCurrentScore()/getCurrentOver();
}
	public  double calReqRunRate() {
		return (getTargetScore()-getCurrentScore())/(getMaxOvers()-getCurrentOver());
		
	}
 }
