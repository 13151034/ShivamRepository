package Package1;

public class ClassB {
	 
	int shivam;  //global variable
	
	public void m1(int a)   ///local variable
	{
		shivam=a; //giving local variable value to global variable
		
	}
public static void main(String[] args) {
	
	ClassB Ref=new ClassB();
	Ref.m1(10);
	System.out.println(Ref.shivam);
}
}
