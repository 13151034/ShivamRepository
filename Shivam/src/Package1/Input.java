package Package1;

import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		System.out.println("Please enter the value for a");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("value of a is "+a);
		System.out.println("Please enter the value for b");
		float b=s.nextFloat();

System.out.println("value of b is "+b);
	}
}
