package ARRAYS;

import java.util.Scanner;

public class TwoDinsert {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows");
		int rows=sc.nextInt();
		System.out.println("enter colums");
		int col=sc.nextInt();
		int[][] a=new int[rows][col];
		int i,j;
		for(i=0;i<rows;i++)
		{
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
		}
		for(i=0;i<rows;i++)
		{
		  for(j=0;j<col;j++)
		   System.out.print(a[i][j]+" ");
		}
		System.out.println();

	}

}
