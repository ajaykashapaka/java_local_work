package Source;
public class evenorodd 
{
	public static void main(String[] args)
	{
		double num=143.6,rem,sum=0;
		 while(num>0)//143.6//14.0>0
		{
	     rem=num%10;//3.6//4.0//1.0
	     num=num/10;//14.0//1.0//0
	     sum=sum+rem;//0+3.6=3.6//3.6+4.0=7.0//7.0+1.0=8
		}
		 System.out.println(sum);
	}
}
