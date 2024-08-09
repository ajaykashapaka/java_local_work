
public class Poly_2 
{
	public static void main(String[] args) 
	{ 
		C c=new C();
		c.method1();
		c.method2(4);
		c.method3('a');
	}
}
class P
{
	public void  method1()
	{
		System.out.println("P method1");
	}
	public void method2(int a)
	{
		System.out.println("P method2 ");
	}
	public void method3()
	{
		System.out.println("P method3");
	}
}
class C extends P
{
	public void  method1()
	{
		System.out.println("c method1");
	}
	public void method2()
	{
		System.out.println("c method2");
	}
	public void method3(char c)
	{
		System.out.println("c method3");
	} 
}
