package assignment8;
import java.io.*;
import java.util.Scanner;

public class ProverbCollection {
	static void storeProverb(String st) throws IOException{
		BufferedWriter writes = new BufferedWriter(new FileWriter("TopProverbs.txt",true));
		{
			writes.write(st);
			writes.newLine();
			writes.close();
		}
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter proverbs or Stop");
		String st = "";
		while (true) {
		st=sc.next();
		if(st.equals("STOP")) {
			break;
		}
		else
		{
			storeProverb(st);
			
		}
		}
		sc.close();
	}

}
