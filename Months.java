import java.util.*;
public class Months{
private static Scanner sc;
public static void main(String args[]){
sc=new Scanner(System.in);
int days=0,m,y;
String name="unknown";
System.out.println("enter number");
m=sc.nextInt();
System.out.println("enter year");
y=sc.nextInt();
switch(m){
case 1:
	name="january";
	days=31;
	break;
case 2:
	name="february";
	if((y%400==0)||((y%4==0)&&(y%100!=0))){
		days=29;}
	else{
		days=28;
	}
	break;
case 3:
	name="march";
	days=31;
	break;
case 4:
	name="april";
	days=30;
	break;
case 5:
	name="may";
	days=31;
	break;
case 6:
	name="june";
	days=30;
	break;
case 7:
	name="july";
	days=31;
	break;
case 8:
	name="august";
	days=31;
	break;
case 9:
	name="september";
	days=30;
	break;
case 10:
	name="october";
	days=31;
	break;
case 11:
	name="november";
	days=30;
	break;
case 12:
	name="december";
	days=31;
	break;
}
System.out.println(name+ "" +y+ "has" +days+ "Days\n");
}
}
