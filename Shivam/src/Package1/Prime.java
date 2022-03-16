package Package1;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter value for a");  //23
		int a=sc.nextInt();
		int flag=0;
		if((a==0)||(a==1))
		{
			System.out.println("prime");
		}
		else
		{
		for(int i=2;i<=(a/2);i++)
		{
			if(a%i==0)
			{
				System.out.println("not prime");
				flag=1;
				break; // to move out of loop
			}
		
		}
			 if(flag==0)
			{
				System.out.println("prime");
		}
}

	}
}