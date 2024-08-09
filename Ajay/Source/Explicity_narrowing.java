package Source;
public class Explicity_narrowing 
{
	public static void main(String[] args) 
	{ 
		int myInt=34;
		double myDouble=54;
		myInt=(int)(myDouble);//54.0
		System.out.println(myInt+"\n"+myDouble);//34//54.0
	}
}
