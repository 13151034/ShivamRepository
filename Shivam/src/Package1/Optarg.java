package Package1;

public class Optarg {

	public void method1(Object...a) //syntax of writing optional arguments
	                                // if in place of string, user passes integer value then
	                                       //object will call integer type values
	                                 // if user uses object in place of string, then object can call any type of value
	{
		if(a.length==0)
		{
			System.out.println("default");
			
		}
		else
		{
			System.out.println("parameterized");
		}
	}
	public static void main(String[] args) {
		
		Optarg ref=new Optarg();
		ref.method1();
		ref.method1("");
		ref.method1("shivam", "anand");
		ref.method1("optional arguments");
		ref.method1(1,2,3);
		ref.method1('a','b');
		
	}
}
