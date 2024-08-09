package ARRAYS;

public class Two_D_arm 
{
	public static void main(String[] args)
	{ 
		int [] a[]=new int[][] {{1,2,3},
			                    {4,5,6},
			                    {7,8,9}};
	 int i,j;
	 for(i=0;i<3;i++)
	 {
		 for(j=0;j<3;j++)
		 {
			 int temp,rem;
			 temp=a[i][j];
			 int count=0;
			 double sum=0;
			while(a[i][j]>0) 
			{
				a[i][j]=a[i][j]/10;
				count++;
			}
			System.out.println("count"+count);
			a[i][j]=temp;
			while(a[i][j]>0)
			{
				rem=a[i][j]%10;
				a[i][j]=a[i][j]/10;
				sum=sum+Math.pow(rem,count);
			}
			System.out.println("sum"+sum);
			a[i][j]=temp;
			if(a[i][j]==sum)
			{
				System.out.println(a[i][j]);
			}
		 }
	 }
	}
}
