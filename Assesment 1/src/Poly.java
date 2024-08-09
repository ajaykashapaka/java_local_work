
public class Poly extends Child
{
	void add ()  //overriding
	{
	System.out.println("am in overring"+(a+b));
	}
	void sub()
	{
		System.out.println("am in overriding"+(a-b));
	}

	public static void main(String[] args) 
	{ 
		Poly p=new Poly();
		p.add();
		p.sub();
  
	}

}
class Child
{
	int a;
	int b;
	void add()  //first method in p
	{
	  a=10;
	  b=20;
	  System.out.println(a+b);
	}
	void sub()  //
	{
		a=10;
		b=20;
		System.out.println((a-b)+"out dated");
	}
}
