
interface i
{
 int a = 8;
	int b=23;
	public void method1();
	public void method2();
}
abstract class demo 
{
	
	int a;
	int b;
	public void add()
	{
		a=10;
		b=20;
		System.out.println(a=a+b);
	}

 
	public abstract  void  sub();
}

class test extends demo implements i 
{
  int a,b;
	@Override
	public void sub()
	{ 
		a=12;
		b=3;
		System.out.println(a-b);		
	}

	@Override
	public void method1() 
	{
	System.out.println("method1");	
	}

	@Override
	public void method2()
	{
		System.out.println("method2");	
	}	
}
public class Abs 
 {
	public static void main(String[] args) 
	{
     test t=new test();
     t.add();
     t.sub();
     t.method1();
     t.method2();
	}
}
