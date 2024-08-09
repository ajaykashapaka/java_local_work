package ARRAYS;
import java.util.Scanner;
public class right_4 
{
	public static void main(String[] args) 
	{
		while(true)
		{
		 int[] a=new int[10];
		 int i,rot,temp;
		 System.out.println("well come");
		 Scanner sc=new Scanner(System.in);
		 for(i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();//10,20,30,40,50,60,70,80,90,100
		 }
		 System.out.println("enter rotate value");
		 rot=sc.nextInt();//6
		 temp=a.length-rot;
		 for(i=temp;i<a.length;i++)//
		 {
			 System.out.print(a[i]+" ");//100//90;80
		 }
		 for(i=0;i<temp;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		}
	}
}

