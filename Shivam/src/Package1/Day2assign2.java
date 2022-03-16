package Package1;

public class Day2assign2 {

	public int sum(int a,int b)
	{
		int sum;
		sum=a+b;
		System.out.println("sum is "+sum);
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
	}
	public void div(int g, int h)
	{
		int div;
		div=g/h;
		System.out.println("The final value is "+div);
		
	}
public static void main(String[] args) {
	Day2assign2 Ref= new Day2assign2();
	int multiresult=Ref.mult(10, 2);
	int sub= Ref.sub(multiresult, 2);
	int multi2=Ref.mult(sub, 2);
	int sum= Ref.sum(multi2, 2);
	Ref.div(sum, 2);
	

}
}

