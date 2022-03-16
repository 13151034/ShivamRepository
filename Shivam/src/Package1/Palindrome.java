package Package1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter value for a");  
		int a=sc.nextInt(); //151
		int sum=0;
		int org=a;
		while(a>0)
		{
		int rem=a%10; //1,5,1
		sum=sum*10+ rem; //1,15,151
		a=a/10; //15,1,0
		}		
		if(sum==org)
		{
			System.out.println("palindrome num");
		}
		else
			System.out.println("not plaindrome");
}

}