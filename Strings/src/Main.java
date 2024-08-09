
public class Main
{
	public static void main(String[] args) 
	{ 
	 int num,rem,div,rev;
	 
	 num=123;rev=0;
	 while(num!=0)
	 {
		rem=num%10;
		rev=rev+rem;
		num=num/10;
	 }
	 System.out.println(rev);
	}

}
