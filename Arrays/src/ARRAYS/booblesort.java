package ARRAYS;
import java.util.Scanner;
public class booblesort 
{
	public static void main(String[] args) 
	{ 
		int[] a=new int[10];
		int i,j;
		System.out.println("well come ");
		Scanner sc=new Scanner (System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	    for(i=0;i<a.length;i++)
		 {
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]^a[j];
					a[j]=a[i]^a[j];
					a[i]=a[i]^a[j];
				}
			}	
		}
		System.out.println("Ascending Elements:");
		for(int x:a)
			System.out.print(x+" ");
		   for(i=0;i<a.length;i++)
			 {
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						a[i]=a[i]^a[j];
						a[j]=a[i]^a[j];
						a[i]=a[i]^a[j];
					}
				}	
			}
		   System.out.println("\ndecending element are:");
		   for(int x:a)
				System.out.print(x+" ");
	}
}
