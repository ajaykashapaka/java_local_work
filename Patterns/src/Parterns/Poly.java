package Parterns;

public class Poly extends Parent   // child pa
{
	void method1()
	{
		System.out.println("am i child 1");
	}
	void method2()
	{
		System.out.println("am in child 2");
	}

	public static void main(String[] args) 
	{
		Poly p=new Poly();
		p.method1();
		p.method2();       //overriding---by parent
 	}
}
class Parent   // parent
{
	void method1()
	{
		System.out.println("parent in 1");
	} 
	void method2()
	{
		System.out.println("parent in method2");
	}
}
