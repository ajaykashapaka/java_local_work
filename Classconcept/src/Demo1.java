 
public class Demo1 
{
	public static void main(String[] args) 
	{
		int num=7,fact=0;
		 Salm h1=new Salm(); 
		 int result=h1.Cal(num, fact);
		if(fact==2)
		{
			System.out.println("prime");
		}
		else
			System.out.println("nor prime");

	}
}
class Salm
{
	public int Cal(int num,int fact)
	{
      for(int i=1;i<=num;i++)
       {
	     if(num%i==0)
	    	 fact++;
       }
       return fact;
	}
	 
}
