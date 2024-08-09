package ARRAYS;

public class DupElement {

	public static void main(String[] args)
	{ 
	int a =123,rem = 0,sum=0;
	int temp=a;
	while(a!=0)
	{
		rem=a%10;
		a=a/10;
		sum=sum*10+rem;
	
	
	if((rem/5==0)&&(rem/7==0))
		System.out.print(rem);
	else
		System.out.println("not valid");
	}
	}
}
