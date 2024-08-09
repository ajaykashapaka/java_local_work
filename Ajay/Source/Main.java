package Source;
public class Main
{
	public static void main(String[] args) 
	{
		Add a=new Add();  //
		Dto R=new Dto();
		R=a.method1(10,20);
		System.out.println(R.getA
				()+" "+R.getB());  //
	}
}
class Add
{
	public Dto method1(int x,int y)
	{
		Dto d=new Dto();
		d.setA(x);
		d.setB(y);
		return d;
	}
}
class Dto
{
	private int a;
	private int b;
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	public int getA()
	{
		return a;
	}
	public int getB()
	{
		return b;
	}
}
