import java.util.Scanner;
public class Factorial{
private static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
int n,fact=1,i;
System.out.println("enter the number");
n=sc.nextInt();
for(i=1;i<=n;i++){
fact=fact*i;}
System.out.println("the factorial is" +fact);
}
}