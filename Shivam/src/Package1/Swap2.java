package Package1;

import java.util.Scanner;

public class Swap2 {
	

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter value for a");  //23
		int a=sc.nextInt();
		System.out.println("enter value for b"); //11
		int b=sc.nextInt();
		
		a=a+b; //34
        b=a-b; //23
        a=a-b;
		
		System.out.println("value of a is " +a);
		System.out.println("value of b is " +b);
	}

}
