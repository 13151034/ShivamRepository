package Package1;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		System.out.println("enter the num whose factorial you want to print");		
		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
		int fact=1;
		
		
		for(int i=1;i<=a;i++)
		{
			
			 fact=fact*i ;
			 
		}

		 System.out.println("factorial of num is" +fact);
		
		
		
	}
}
