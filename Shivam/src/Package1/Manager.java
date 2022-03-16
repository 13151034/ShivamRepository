package Package1;

public class Manager extends Employee {
	
	public void salary() {
		System.out.println("my salary is 20k");
		
	}
	 public void bonus()
	 {
		 System.out.println("my bonus is 2k");
	 }
	 
	 public static void main(String[] args) {
		Manager ref= new Manager();
		ref.salary();
		ref.bonus();
		ref.employeeid();
		ref.email();
		ref.phoneno();
		
		
	}

}
