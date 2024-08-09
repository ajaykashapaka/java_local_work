
import java.util.Arrays;
public class ArraDemo 
{
	public static void main(String[] args) 
	{  
		int[] a=new int[] {0,11,2,0,121,0,10,0};
		
		Arrays.sort(a);		
		
		for(int i=0;i<a.length;i++)
		{
		  if(a[i]!=0)
		  {
			  System.out.print(a[i]+" ");
		  }
		}
	}
}
