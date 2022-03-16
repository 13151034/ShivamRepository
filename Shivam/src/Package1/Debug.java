package Package1;

public class Debug {
	
	public void abc()
	{
		System.out.println("i am first line of method1");
		System.out.println("i am 2nd line of method1");	
	}

	public void xyz()
	{
		System.out.println("i am first line of method2");
		System.out.println("i am 2nd line of method2");	
	}
public static void main(String[] args) {
	
	System.out.println("i am the bug");
	Debug d= new Debug();
	
		System.out.println("i am first line of main method");
		System.out.println("i am 2nd line of main method");	
	d.abc();
	System.out.println("i am 3rd line of main method");
	d.xyz();
	System.out.println("i am 4th line of main method");

}
}
