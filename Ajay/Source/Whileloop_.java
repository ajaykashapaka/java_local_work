package Source;
public class Whileloop_
{
	public static void main(String[] args) 
	{
		int num=12345,div,mod,sum=0;
		
		while(num>0)//123
		{
			mod=num%10;
			num=num/10;
			sum=sum*10+mod;
		}
		System.out.println(sum);//6
	}
}
