package assignment6;
//import java.io.IOEXception;
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int output=0;
			
		try {	
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		 
		 output=n1/n2;
		}
		catch(NullPointerException e) {
			System.out.println("No Input is received");
		}
		catch(NumberFormatException e) {
			System.out.println("Only intergers are allowed");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Division with zero is not possible");
		}
		System.out.println(output);
		
		

	}

}
