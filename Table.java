import java.util.*;
public class Table{
private static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
int number=0,i,num;
System.out.println("enter the number");
number=sc.nextInt();
for(i=1;i<=20;i++){
num=number*i;
System.out.println(number+"*"+i+"="+num);
}
}
}
