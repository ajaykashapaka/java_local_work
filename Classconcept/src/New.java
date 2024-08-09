
public class New 
{
	public static void main(String[] args) 
	{ 
		ajay k=new ajay();
		int c=k.add(100,99);
		System.out.println(c);
	}

}
class ajay
{
	public int add(int a,int b)
	{
		a=a-b;
		return a;
	}
}