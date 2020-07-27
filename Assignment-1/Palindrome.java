import java.util.Scanner;
public class Palindrome{
private static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
int n=0,remainder=0,reversenum=0,n1=0;
System.out.println("Enter the number");
n1=sc.nextInt();
n=n1;
while(n>0){
remainder=n%10;
reversenum=(reversenum*10)+remainder;
n=n/10;
}
if(n1==reversenum){
System.out.println(n1 + "is a palindrome");
}
	else{
	System.out.println(n1 +" is not a palindrome");
}
}
}