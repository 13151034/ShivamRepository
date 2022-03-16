package Package1;

public class Student {

	int age;
	int rollno;
	
	public void dispaly1()
	{
		System.out.println("Welcome to all of you");
	
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student a= new Student();
		a.dispaly1();
		a.display2();
		a.age=22;
		a.rollno=23;
		System.out.println("my age is " +a.age);
		System.out.println("my roll number is " +a.rollno);
		
	}
}
