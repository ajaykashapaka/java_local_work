package Note;

public class Mul 
{
	public static void main(String[] args)
	{
		int row=3;int col=3;
		 int [][]a=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		 int i,j;
		 int sum=0;
		 for(i=0;i<3;i++)
		 {
			 
			 sum=sum+a[i][i];
		 }
		 System.out.println(sum);
		 
		 for(i=0,j=3-1;i<3;i++,j--)
		 {
			 sum=sum+a[i][j];
		 }
		 System.out.println(sum);
	}
}
