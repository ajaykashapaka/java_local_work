package ARRAYS;

public class Prime_sumoFarray
{
	public static void main (String args[])
	{
		int[] a=new int[] {7,9,13,5,88};
		int i,fact,sum=0;
		System.out.println("prime numbers");
		for(i=0;i<a.length;i++)//0<5//1<5
		{
			fact=0;
			
			for(int j=1;j<=a[i];j++)//1<7//1<9
			{
				if(a[i]%j==0)//7%1=0------7%7//9%1=0--9%3=0--9%=0
				{
					fact++;//1+1//3
					
				}		
			}
			
			if(fact==2)//true
			{
			System.out.print(" "+a[i]);//7
			sum=sum+a[i];//0+7=7
			}
		} 	
		System.out.println("\n sum is"+sum);
	}
}
