package Parterns;

public class PP {

	public static void main(String[] args) 
	{ 
		int i,j,k;
		int n=4;
		for(i=1;i<=n;i++)//1<=5;2<=5;
		{
			for(j=3;j>=i;j--)//1<=1
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)//1<=1
			{
				System.out.print("*");//*
			}
			System.out.println("");
		}
       for(i=1;i<=4;i++)
        {
	     for(j=1;j<=i;j++)
	     {
	    	 System.out.print(" ");
	     }
	     for(k=3;k>=i;k--)
	    	 System.out.print("*");
	     System.out.println("");
        }
	}
}/* *****
    _****
    __***
    ___**
    ____* */
