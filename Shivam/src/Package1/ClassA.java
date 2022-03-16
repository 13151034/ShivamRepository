package Package1;

public class ClassA {
	
	public void method1()
	{
		this.method2();
		System.out.println("This is method1");
		this.method2();
		this.method3();
		
	}

	public void method2()
	{
		this.method3();
		System.out.println("This is method2");
	}
	
	public void method3()
	{
		System.out.println("This is method3");
	}
	
	public static void main(String[] args) {
		
		ClassA ref=new ClassA();
		ref.method1();
	}
}
