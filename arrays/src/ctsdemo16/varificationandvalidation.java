package ctsdemo16;
import java.util.Scanner;
import java.util.*;
public class varificationandvalidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
		String spcialcharacters="!,#,$,%,^,&,*,|";
		String pass="";
		int i=0;
		pass.matches(".+[a-z].+");
		pass.matches(".+[1-9].+");
		
		System.out.println("access denied");
		
	}

}
