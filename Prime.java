import java.util.Scanner;
public class Prime{
public static void main(String args[]){
int x,n,i;
boolean y=true;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
n=sc.nextInt();
sc.close();
for(i=2;i<=n/2;i++){
x=n%i;
if(x==0){
y=false;
break;
}
}
if(y)
System.out.println(n+" is a prime number");
else
System.out.println(n+" is not a prime number");
}
}

