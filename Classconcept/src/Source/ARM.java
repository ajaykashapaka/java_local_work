package Source;
import java.util.Scanner;
public class ARM
{
	public static void mai(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();//153
		ajju aj=new ajju();//create obj
		int result=aj.dis(num);//method call
		System.out.println(result);
		if(num==result)
		System.out.println("arm");
		else
			System.out.println("not arm");
	}
}
class ajju
{
	public int dis(int num)//implimentation
	{
		int rem=0,temp=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			temp=temp+1;
		}
		return temp;
	}
}
