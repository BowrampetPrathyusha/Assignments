import java.util.Scanner;

public class Reversenatural1{
private static Scanner sc;
public static void main(String args[]){
int n,i;
sc=new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();

for(i=n;i>=1;i--){
System.out.println(i+" ");
}
}
}
