import java.util.Scanner;
public class NumberToWord{
private static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
int n;
System.out.println("enter a number");
n=sc.nextInt();
if(n==1){
System.out.println("one");
}
else if(n==2){
System.out.println("two");
}
}
}