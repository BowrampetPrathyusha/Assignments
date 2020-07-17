import java.util.Scanner;
public class ReverseNumber{
private static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
int x,y=0;
System.out.println("Enter x");
x=sc. nextInt();
while(x!=0){
int digit=x%10;
y=y*10+digit;
x=x/10;
}
System.out.println("Reverse of entered number is :"+y);
}
}
