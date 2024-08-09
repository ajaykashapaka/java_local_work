package First;

class Con_overloaad 
{
	public static void main(String[] args) 
	{
     Demo1 d=new Demo1(12,'c');
    
     Demo1 A=new Demo1('c',"name");
     d.display();
     A.dis();
	}
}
class Demo1
{
	int a;
	String name;
	char code;
	Demo1(int a, char code)
	{
		this.a=a;
		this.code=code;
	
	}
	public void display()
	  {
		System.out.println(a+" "+code);
	  }
	Demo1(char code, String name)
	  {
		this.code=code;
		this.name=name;
	  }
	public void dis()
	  {
		System.out.println(code+" "+name);
	   }
}