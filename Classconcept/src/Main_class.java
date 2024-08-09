
public class Main_class 
{

	public static void main(String[] args) 
	{ 
		Calculation c=new Calculation();//creat an object
		 c.add(10,20);//method call
	}
}
class Calculation
{
	int a,b;
	public void add(int a,int b)//medthod implimentation
	{
		a=a+b;
		System.out.println(a);
	}
}
