
interface printtable
{
	public void print();
}
public class Impli implements printtable 
{
	public static void main(String[] args) 
	{
    Impli i=new Impli();
    i.print();
	}

	@Override
	public void print()
	{
		 System.out.println("print");
		
	}

}
