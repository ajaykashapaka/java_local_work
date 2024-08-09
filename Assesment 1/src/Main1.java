
public class Main1 {

	public static void main(String[] args) 
	{
	  Demo d=new Demo();
	  d.m1();
	}

}
class Demo
{
	public static void m1()
	{
		m2();
		System.out.println("im in m1");
	}
	public static void m2()
	{
		m3();
		System.out.println("im in m2");
	}
	private static void m3() 
	{ 
		System.out.println("im in m3");
		
	}
}
