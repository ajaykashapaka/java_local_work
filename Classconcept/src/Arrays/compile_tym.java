package Arrays;

import java.util.Random;
import java.util.Scanner;

public class compile_tym 
{
	public static void main(String[] args)
	{
		int[] a=new int[] {1,2,3,4,5,6,7,8,9};
		int i,sum=0,avg=0;
		System.out.println("length is"+a.length);
        for(i=0;i<=a.length-1;i++)
        {
        	sum=sum+a[i];
        }
        System.out.println(sum);
        avg=sum/a.length;
        System.out.println("avg is:"+avg);
    }
}
