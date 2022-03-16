package Package1;

public class biks extends Vehicle
{

	public void run()
	{
		System.out.println("BIke is running");
	}
	public static void main(String[] args) {
		
		biks ref= new biks();
		ref.run();
	}
}
