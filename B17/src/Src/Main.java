package Src;

public class Main 
{
	public static void main(String[] args) 
	{
       Child c=new Child(10,30);
       System.out.println(c.add(10,30));
       c.sub();//30-10==20
      System.out.println(c.div(4,7));//0
       c.mul();   //4*7=24
       
 	}
}
class Parent
{
	int a,b;
	Parent(int a,int b)//
	{
		this.a=a;
		this.b=b;
	}
	public int add(int a,int b)
	{
		a=a+b;
	    return a;//40
	}
	public void sub()
	{
		System.out.println(a-b);//10-30=-20
	}
}
class Child extends Parent
{
	int x,y;
	Child(int a,int b)//10,30
	{
		super(a,b);//10,30
		x=a;//10
		y=b;//30	
	}
	int div(int a,int b)
	{ 
		a=a/b;
		return a;//0
	}
	void mul()
	{
		a=a*b;//10*30
		System.out.println(a);
	}
}

