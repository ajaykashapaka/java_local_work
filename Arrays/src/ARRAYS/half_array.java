 package ARRAYS;
import java.util.Scanner;
public class half_array 
{
	public static void main(String[] args) 
	{
		 int[] a=new int[10];
		 int i,j;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter array element");
		 for(i=0;i<a.length;i++)
		 { 
			 a[i]=sc.nextInt();		 }
		 System.out.println("1st half");
		 for(i=0;i<a.length/2;i++)
		 { 
			 for(j=0;j<a.length/2;j++)
			 {
			 if(a[i]>a[j])
			  {
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			   }
			 }
		 }
		 for(i=0;i<a.length/2;i++)
			 System.out.println(a[i]);
		 
	System.out.println("\n 2nd half");
		 for(i=a.length/2;i<a.length;i++)
		 {
			 for(j=a.length/2;j<a.length;j++)
			 {
				 if(a[i]<a[j])
				 {
					 a[i]=a[i]+a[j];
					 a[j]=a[i]-a[j];
					 a[i]=a[i]-a[j];
				 }
			 }
		 }
		 for(i=a.length/2;i<a.length;i++)
			 System.out.print(a[i]+" ");
	}
}