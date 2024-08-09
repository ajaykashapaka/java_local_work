package Source;
import java.util.Scanner;
public class AJAY
{
	public static void main(String[] args)
	{ 
		ajjuy aj=new ajjuy();//create obj
		aj.dis();//method call		
	}
}
class ajjuy
{
	public void dis()//implimentation
	{
		int rem=0,count=0,num;
		double sum=0;
		for(num=1;num<=1000;num++)
		{
			sum=0;count=0;
		while(num>0)
		{
			rem=num/10;
			count=count+1;	
		}
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=(sum+Math.pow(rem, count));
		}	
		if(num==sum)
			System.out.println(num);
		}
	}
}


