package Package1;

public class ClassC {
	 
	int shivam; 
	
	public void m1(int shivam)   
	{
		this.shivam=shivam; 
		
	}
public static void main(String[] args) {
	
	ClassB Ref=new ClassB();
	Ref.m1(10);
	System.out.println(Ref.shivam);
}
}
