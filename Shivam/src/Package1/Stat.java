package Package1;

public class Stat {

	int a; //global variable and its default value is 0
	public void Input()
	{
	a=a+1;	
	}

public static void main(String[] args) {
	
	System.out.println("object1");
	Stat s= new Stat();
	s.Input();
	System.out.println(s.a);
	System.out.println("object2");
	Stat s1= new Stat();
	s1.Input();
	System.out.println(s1.a);
	}}

