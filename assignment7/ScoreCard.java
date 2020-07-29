package assignment7;
import java.util.*;
import java.util.Map.Entry;
public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> score=new HashMap<String, Integer>();
		System.out.println("Enter runs scored");
		int[] array=new int[5];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i < array.length;i++) {
			     array[i]=sc.nextInt();
		}		
		score.put("Rahane" ,array[0]);
		score.put("Rahul" ,array[1]);
		score.put("Kohli" ,array[2]);
		score.put("Dhoni" ,array[3]);
		score.put("Lokesh",array[4]);
		
		System.out.println("Players who batted: ");
		  Set<String> key1 = score.keySet();
	      for(String keys : key1) {
	          
	      System.out.println(keys);
	      }
	      
	      int maxi = 0, sum = 0;
	      int maxValue=(Collections.max(score.values()));
	      System.out.print("Scores of players: ");
	      for (Map.Entry<String, Integer> map  : score.entrySet()) {
	    	 
	    	  System.out.println(map.getKey() + ":"+map.getValue());
				
	      if (maxi< map.getValue()) {
				maxi = map.getValue();
			}
			sum = sum + map.getValue();
			 
			
		}
		System.out.println("\nThe total Score is: "+sum); 
		
        for (Entry<String, Integer> entry : score.entrySet()) {  
            if (entry.getValue()==maxValue) {
               System.out.println("Name of the highest Scorer :"+entry.getKey());     
            }
        }
        System.out.println("Runs scored by dhoni:"+array[3]);
        sc.close();
	}
}
