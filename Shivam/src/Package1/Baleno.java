package Package1;

public class Baleno extends Maruti {

	public void Secondcar()
	{
		System.out.println("This is the second model");
	}
	
	public static void main(String[] args) {
		Baleno ref = new Baleno();
		ref.Secondcar();
		ref.baseprice();   // hierarchical inheritance
		// no relationship between swift and baleno class
	}
}

