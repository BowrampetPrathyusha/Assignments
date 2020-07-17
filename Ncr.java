import java.util.Scanner;
public class Ncr{
private static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
int n=0,r=0;
System.out.println("enter n");
n=sc.nextInt();
System.out.println("enter r");
r=sc.nextInt();
int NCR=fact(n)/(fact(n-r)*fact(r));
System.out.println("the value of "+n+"c"+r+"is" +NCR);
}
static int fact(int n){
int i,f=1;
for(i=1;i<=n;i++){
f=f*i;
}
return f;
}
}