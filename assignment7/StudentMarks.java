package assignment7;
import java.util.*;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter no.of Students");
		int n=sc.nextInt();
		System.out.println("Enter the marks of Students");
		
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			list.add(m);
		}
		
		int sum=0;
		for(int num: list) {
			sum=sum+num;
	}
		int average=sum/n;
        System.out.println("Highest marks: "+Collections.max(list));
        System.out.println("Average marks: "+average);
        System.out.println("3rd student student is: "+list.get(2));
        System.out.println("Marks: "+"1-"+list.get(0)+"\t"+"2-"+list.get(1)+"\t"+"3-"+list.get(2)+"\t"+"4-"+list.get(3)+"\t");
        Collections.sort(list); 
		System.out.println("Sorted : " + list);
sc.close();
}
}
