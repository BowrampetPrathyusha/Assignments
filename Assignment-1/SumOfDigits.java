import java.util.*;
public class SumOfDigits{
private static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
int x,p,s=0;
System.out.println("enter the  number");
x=sc.nextInt();
while(x>0){
p=x%10;
s=s+p;
x=x/10;
}
System.out.println("Sum of digits" +s);
}
}
