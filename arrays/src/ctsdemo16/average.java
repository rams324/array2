package ctsdemo16;
import java.util.Scanner;
public class average {

	public static void main(String[] args) {
	int n,i,sum=0;
	double avg=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int[] m=new int[n];
	for(i=0;i<n;i++)
	{
		m[i]=sc.nextInt();
	}
	for (i=0;i<n;i++)
	{
  sum=sum+m[i];
  avg=sum/n;
	}
System.out.println("sum is:"+sum);
System.out.println("avg is:"+avg);
	}
}
