 

public class sumofdigits 
{
	public static void main(String[] args)
	{	 
		int n=9,a,sum=0,rev;
		a=n*n;//81
		while(a>0)//81>0;8>0;0>0
		{
			rev=n%10;//1;8
		    a=a/10;//8;0
		    sum=sum+rev;//0+1=1+8=9
		    System.out.println(sum);	    
		}
	 
		if(n==sum)
			System.out.println("amezing");
		else
			System.out.println("not amezing");
		
	}
}
