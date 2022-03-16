package Package1;

import java.util.Scanner;
public class Stat1 {
	
		static int a; // static global variable and its default value is 0
		public void Input()
		{
		a=a+1;	
		}

	public static void main(String[] args) {
		System.out.println("obj1");
		Stat1 ref1= new Stat1();
		ref1.Input();
		System.out.println(ref1.a);
		
		System.out.println("obj2");
		Stat1 ref2= new Stat1();
		ref2.Input();
		System.out.println(ref2.a);
		
		System.out.println("obj3");
		Stat1 ref3= new Stat1();
		ref3.Input();
		System.out.println(ref3.a);
		}}


