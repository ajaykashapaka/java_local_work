
public class TestOne 
{
	int a;
    void show(int a)
    {
    	this.a=a;
    	System.out.println("over loading"+ a);
    }
    void show(int a,int b)
    {
    	System.out.println("over loading");
    }
	public static void main(String[] args) 
	{
		 TestTwo To=new TestTwo();
		 To.show(10);
		 To.show(12,25);
		 
		 To.show();
	}
}
class TestTwo extends TestOne
{
	void show()
	{
		System.out.println("over riding");
	}
}
