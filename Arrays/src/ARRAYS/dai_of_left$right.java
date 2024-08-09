package ARRAYS;
public class dai_of_left$right {
	public static void main(String[] args) 
	{
		int[] []a=new int[][] {{1,2,3},
			                   {4,5,6},
			                   {7,8,9}};
			                   System.out.println(a.length+"len");
			                   int sum=0,product=1,i,j;
			for(i=0;i<3;i++)
			{
				if(i==i)
				{
					sum=sum+a[i][i];
				}
			}
			System.out.println("sum is:"+sum);
			for(i=0,j=3-1;i<3;i++,j--)
				product=product*a[i][j];
			System.out.println("product is"+product);
			int differ=product-sum;
			System.out.println(differ);
	}
}
