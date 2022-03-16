package Package1;

import java.util.Scanner;

public class Swap1 {
	
	
	

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter value for a");  //11
		int a=sc.nextInt();
		System.out.println("enter value for b"); //22
		int b=sc.nextInt();
		
	int c;
	c=a;
	a=b;
	b=c;
	
	System.out.println("value of a is " +a);
System.out.println("value of b is " +b);		
		
	}
	}

