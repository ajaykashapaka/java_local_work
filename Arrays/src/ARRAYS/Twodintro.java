package ARRAYS;

import java.util.Scanner;

public class Twodintro {

	public static void main(String[] args)
	{
		int []a[]=new int[3][4];  
		System.out.println(a.length);
		System.out.println("hjkh");
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<4;j++)
				a[i][j]=sc.nextInt();
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println(" ");
		}
	}

}
