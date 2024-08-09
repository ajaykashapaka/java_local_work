package ARRAYS;

public class two_dsum {

	public static void main(String[] args) 
	{ 
		int[] []a=new int[][] {{1,2,3},
			                   {4,5,6},
			                   {7,8,9}};
			                   System.out.println(a.length+"len");
			 int i,j,sum=1;
			 for(i=0;i<3;i++)
				 for(j=0;j<3;j++)
				 {
					 if(a[i]==a[j])
					 {
					 System.out.println(a[i][j]);
					 sum=sum*a[i][j];
					 }	 
				 }
			 System.out.println("sum is"+sum);		                   
	}
}
