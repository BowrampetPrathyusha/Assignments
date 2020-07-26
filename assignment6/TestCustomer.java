package assignment6;

import java.util.*;
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer number: ");
		Customer c= new Customer();
		
		String CustNo=sc.nextLine();
		System.out.println("Enter customer name");
		String CustName=sc.nextLine();
		System.out.println("Enter category");
		String Category=sc.nextLine();
	try {
	if((CustNo.charAt(0)!='c'||CustNo.charAt(0)!='C')||(CustName.length()!=4)||(!Category.equals("Gold")||!Category.equals("Platinum")||!Category.equals("Silver"))){ 
	 
		System.out.println("Entered details are incorrect");
		throw new Exception();
		
	}
	
	}
	
	catch(Exception e) {
		System.out.println(e);
	}
	
		
	System.out.println("customer number: "+CustNo+"\n"+"customer name: "+CustName+"\n"+"category: "+Category);
	
	sc.close();
		
		

	}
}


