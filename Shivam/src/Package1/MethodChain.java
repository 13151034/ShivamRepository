package Package1;

public class MethodChain {

	
	public void m0()
	{this.m3(1, 2, 3);
		System.out.println("This is default method");
	}
	public void m1(int a)
	{
		this.m0();
		System.out.println("This is one parameterized method");
	}
	public void m2(int c, int b)
	{
		this.m1(1);
		System.out.println("This is two parameterized method");
	}
	public void m3(int d, int e, int f)
	{
		System.out.println("This is three parameterized method");
	}
	public void m4(int g, int h, int i, int j)
	{
		this.m2(1,2);
		System.out.println("This is four parameterized method");
	}
	
	public void m5(int g, int h, int i, int j, int k)
	{
		this.m4(1,2,3,4);
		System.out.println("This is five parameterized method");
	}
	public static void main(String[] args) {
		
		MethodChain Ref= new MethodChain();
		Ref.m5(1,2,3,4,5);
		
	}
}
