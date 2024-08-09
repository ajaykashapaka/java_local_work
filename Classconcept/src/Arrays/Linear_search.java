package Arrays;

import java.util.Scanner;

public class Linear_search 
{
	public static void main(String[] args) 
	{ 
		int[] ar=new int[8];
		int i,tem;
		System.out.println("enter arrey value true");
		Scanner sc=new Scanner(System.in);
		tem=ar[0];
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		for(i=0;i<ar.length-1;i++)//0<7
		{
			ar[i]=ar[i+1];
		}
		ar[i]=tem;
		for(int z:ar)
		{
			System.out.print(z+" ");
		}

	}

}
