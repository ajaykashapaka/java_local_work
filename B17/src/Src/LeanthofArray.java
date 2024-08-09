package Src;

import java.util.Scanner;

public class LeanthofArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter the Elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			 sum=sum+a[i];
			 System.out.println();
		}
		System.out.println(sum);
	}

}
