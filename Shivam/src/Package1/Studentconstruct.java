package Package1;

public class Studentconstruct {

	
	public Studentconstruct() {
this(1,2,3);
	System.out.println("This is default constructor");
	}
	

	public Studentconstruct(int a) {
		this(1,2,3,4);
	System.out.println("This is one parameterized constructor");
	}

	public Studentconstruct(int b, int c) {
this();
	System.out.println("This is two parameterized constructor");
	}
	public Studentconstruct(int d, int e, int f) {

		System.out.println("This is three parameterized constructor");
		}
	public Studentconstruct(int g, int h, int i, int j) {
this(1,2);
		System.out.println("This is four parameterized constructor");
		}
	
	public static void main(String[] args) {
		Studentconstruct ref= new Studentconstruct(1);

		
	}
	
}
