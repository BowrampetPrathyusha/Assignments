package assignment8;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ProverbReader {

	public static void main(String[] args) throws IOException  { 
		// TODO Auto-generated method stub
		
			BufferedReader reades = new BufferedReader(new FileReader("TopProverbs.txt"));
			
			try{
			String  st ;
			
			while ((st = reades.readLine()) != null) {
				
		            System.out.println(st);
				
			} 
			}
			finally {
			reades.close();
			
	}
			}
		

}
	

	
	


