abstract class Animal
{
	public abstract void sound();
	
	public void sound1()
	{
		System.out.println("i am in Animal class");
	}
}


public class Dog  extends Animal
{
	@Override
	public void sound() 
	{
		System.out.println("i am in Dog class");
		
	}
	public static void main(String[] args) 
	{
	         Dog d=new Dog();
	         d.sound();
	         d.sound1();     
	}
}
