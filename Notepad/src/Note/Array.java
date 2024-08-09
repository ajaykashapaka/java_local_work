package Note;

public class Array 
{
	public static void main(String args[])
	  {
	    int[] a=new int[]{10,20,30,40,50,60};
	    int i,temp;
	    temp=a[0];//10
	    for(i=0;i<a.length-1;i++)//
	     {
	      a[i]=a[i+1];
	     }
	    a[i]=temp;
	    for(i=0;i<a.length;i++)
	     {
	     System.out.println(a[i]);
	     }

	   }
}
