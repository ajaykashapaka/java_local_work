package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Arrasy_syntax 
{
	public static void main(String[] args) 
	{
		 int[] ar=new int[5];
		 int i; 
	    Random rn=new Random();
		 for(i=0;i<ar.length;i++)
		 {
			 ar[i]=rn.nextInt(100);
		 }
		 for(i=0;i<ar.length;i++)
		 {
			 System.out.println(ar[i]);
		 }
	}

}
