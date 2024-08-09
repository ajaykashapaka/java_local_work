package Note;

public class Ath 
{
	public static void main(String[] args)
	{
	 Test.m1();
	}
}
class Test
{
	public static void m1()
	{
		System.out.println("im in m1");
		m2();	
	}
	public static void m2()
	{
		m3();
		System.out.println("im in m2");
	}
	public static void m3
	()
	{
		System.out.println("im in m3");
	}
}