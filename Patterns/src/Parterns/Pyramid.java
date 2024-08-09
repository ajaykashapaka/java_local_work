package Parterns;

public class Pyramid {

	public static void main(String[] args) 
	{
		 int i,j,n=4;
		 for(i=1;i<=4;i++)
		 {
			 for(j=4;j>=1;j--)
			 {
				 if(j>i)
					 System.out.print(" ");
				 else 
				 {
					 System.out.print("* ");
				 }
			 }
			 System.out.println(" ");
		 }
	}
}
