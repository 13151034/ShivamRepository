package Package1;

public class Stat2 {
	
		static int a; //global variable and its default value is 0
		public static void Input()  //static method
		{
		a=a+1;	
		}

	public static void main(String[] args) {
		
		System.out.println("object1");
		Stat2.Input();
		System.out.println(Stat2.a);
	}
}

