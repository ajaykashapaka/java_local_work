package First;

public class Cons
{
	public static void main(String[] args) 
	{
		demo d=new demo(2,3);
	}

}
class demo
{
	int a;
	int b;
	demo(int a,int b)
	{
	  this.a=a;
	  this.b=b;
	  a=a+b;
	  System.out.println(a);
	  System.out.println(b);
	 
	}
}
