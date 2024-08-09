
public class amezing 
{
	public static void main(String[] args) 
	{ 
		int a=9,b,rem,sum=0;
	    b=a*a;
		System.out.println("b is"+b);
		while(b>0)
		{
		  rem=b%10;
		  b/=10;
		  sum=sum+rem; 
		}
		System.out.println("sum is"+sum);
		if(a==sum)
			System.out.println("amezing");
		else
			System.out.println("not amezing");

	}

}
