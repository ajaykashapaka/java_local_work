package ARRAYS;

import java.util.Scanner;

public class Two_D 
{
	public static void main(String[] args) 
	{
		 int[] []a=new int [3][3];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter");
		 for(int i=0;i<3;i++)
			 for(int j=0;j<3;j++)
				 a[i][j]=sc.nextInt();
		 System.out.println("enter");
		 for(int i=0;i<3;i++)
			 for(int j=0;j<3;j++)
				System.out.println( a[i][j]);

	}

}
