package ARRAYS;
public class EVENINARRAY 
{
	public static void main(String[] args) 
	{
     int[] a=new int [] {8,10,9,5,7,12};
     
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]%2==0)
    	 {
    		 System.out.println(a[i]);
    	 }
    	 else 
    		 System.out.println("odd"+a[i]);
     }
	}
}
