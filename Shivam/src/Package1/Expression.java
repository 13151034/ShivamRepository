package Package1;  

import java.util.Scanner;
public class Expression {

	public int sum(int a, int b)
	{
			int sum;
			sum=a+b;
		
		return sum;
	}
	
	public int sub(int c, int d)
	{
		int sub;
		sub=c-d;
		return sub;
	}
	public int multi(int e, int f)
	{
		int multi;
		multi=e*f;
		return multi;
	}
	public int div(int g, int h)
	{
		int div;
		div=g/h;
		return div;
	}
	
	public static void main(String[] args) {          //(x1+x2)-x3)+x4*)x5)/x6)
		Expression e= new Expression();
		System.out.println("emter value for x1");
		Scanner s= new Scanner(System.in);
int x1=s.nextInt();	

System.out.println("emter value for x2");
int x2=s.nextInt();
int esum=e.sum(x1, x2);
System.out.println("addition is "+esum );

System.out.println("emter value for x3");
int x3=s.nextInt();
int esub=e.sub(esum, x3);
System.out.println("subtraction is "+esub);

System.out.println("emter value for x4");
int x4=s.nextInt();
int esum2=e.sum(esub, x4);
System.out.println("addition is "+esum2);

System.out.println("emter value for x5");
int x5=s.nextInt();
int emulti=e.multi(esum2, x5);
System.out.println("multiplication is "+emulti);

System.out.println("emter value for x6");
int x6=s.nextInt();
int ediv=e.div(emulti, x6);
System.out.println("final output is "+ediv);

	}
}
