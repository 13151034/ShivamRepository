package Package1;

public class Fibbonacci {
	
	public static void main(String[] args)
	{
		int a1=0;
		int a2=1;
		int a3;
		for(int i=1;i<=6;i++)
		{
			a3=a1+a2;
			
				System.out.print(a3+" ");
				a1=a2;
				a2=a3;
				
		}
	}

}
