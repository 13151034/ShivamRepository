package Package1;

import java.util.Scanner;

public class Arms {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter value for a");  
		int a=sc.nextInt(); //153
		int sum=0;
		int org=a;
		while(a>0)
		{
			int rem=a%10; //3,5, 1
			sum=sum+ rem*rem*rem; //27,152,1
			a=a/10; //15,1
}
		if(sum==org)
		{
			System.out.println("armstromg num");
		}
		else
			System.out.println("not armstromg");
	}
}
