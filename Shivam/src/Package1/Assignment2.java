package Package1;

public class Assignment2 {
	
	public int sum(int a,int b, int c)
	{
		int sum;
		sum=a+b+c;
		System.out.println("sum of three numbers is "+sum);
		return sum;
	}
	public int sub(int c, int d)
	{
		int sub;
		sub=c-d;
		System.out.println("subtraction is "+sub);
		return sub;
	}
	
	public int mult(int e, int f)
	{
		int mult;
		mult=e*f;
		System.out.println("multiplication is "+mult);
		return mult;
	}public void div(int g, int h)
	{
		int div;
		div=g/h;
		System.out.println("The final value is "+div);
		
	}
public static void main(String[] args) {
	
	Assignment2 Ref= new Assignment2();
	int sumresult=Ref.sum(10, 2,2);
	int summresult= Ref.sum(sumresult, 2,1);
	int subresult= Ref.sub(summresult, 2);
	int mult= Ref.mult(subresult, 2);
	Ref.div(mult, 2);
	
	
}
}
