package ARRAYS;
import java.util.Scanner;
import javax.annotation.processing.SupportedSourceVersion;
public class Prime_in_ARRAY {
	public static void main(String[] args)
	{ 
		int[] a=new int[6];
		int i,j,fact;
		System.out.println("well come");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			fact=0;
			for(j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
					fact++;
			}
			if(fact==2)
				System.out.println("prime");
			else
				System.out.println("not prime");
		}
	}
}
