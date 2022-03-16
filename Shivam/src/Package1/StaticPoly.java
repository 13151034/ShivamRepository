package Package1;

public class StaticPoly {

	
	public void Area(int a, int b)
	
	{
		int c;
		c=a*b;
		System.out.println("Area of square is " +c);
	}
	
	public void Area(int r)
	{
		float pi= 3.14F;
		float ar= pi*r*r;
		System.out.println("Area of a circle is " +ar);
	}
	
	public static void main(String[] args) {
		
		StaticPoly ref= new StaticPoly();
		ref.Area(2);
		ref.Area(10, 12);
	}
}
