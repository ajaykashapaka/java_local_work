package Arrays;

import java.util.Scanner;

public class Max_value 
{

	public static void main(String[] args) 
	{ 
		int[] ar=new int[] {10,7,8,9,2,1};
		 int i,small;
		  small=ar[0];
		 for(i=0;i<ar.length;i++)
		 { 
			 if(ar[i]%2==0)
				 System.out.println("even "+ar[i]);
			 else
				 System.out.println("odd"+ar[i]);
		 }
	}

}
			 