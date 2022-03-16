package Package1;

import java.util.Scanner;

public class Table {
	
	
	public static void main(String[] args) {
		
System.out.println("enter the num whose table you want to print");		
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		
		for(int i=1; i<=10;i++)
		{
			int tab= a*i;
			System.out.println( a+"*"+i+"="+ tab );
		}
		
	}

}
