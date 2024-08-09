package In;

public class Single
{
	int a;
	int b;
	public static void main(String[] args) 
	{
		Child c=new Child ();
		c.add();//30
		c.sub();//10

	}
	public void add()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}

}
class Child extends Single 
{
	public void sub()
	{
		a=30;
		b=20;
		System.out.println(a-b);
	}
}
