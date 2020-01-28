package ctsdemo16;
import java.util.Scanner;
public class vowelcount {

	public static void main(String[] args) {
	int i,count=0;
		Scanner sc=new Scanner(System.in);
		String sentance=sc.nextLine();
		char ch[]=sentance.toCharArray();
		//char vowle[] = {'a','A','e','E','i','I','o','O','u','U'};
		
		for(i=0;i<ch.length;i++)
		{
			
			if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U')
			{
				count++;
			}
		}
		System.out.println("number of vowels:"+count);
	}

}
