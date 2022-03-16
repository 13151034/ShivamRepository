package Package1;

public class Swiftvdi extends Swift
{
public void modeltype()
{
	System.out.println("model is vdi");
}
public static void main(String[] args) {
	Swiftvdi ref= new Swiftvdi();
	
	ref.model();
	ref.modeltype();
	ref.baseprice();   //multilevel inheritance
}
}
