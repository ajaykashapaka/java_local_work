package Src;

public class Half_array {

	public static void main(String[] args)
	{
     int[ ] a =new int[] {10,12,13,14,66,77,34,20};
    	 int i,j;
    		for(i=0;i<a.length/2;i++)
    		{
    			for(j=0;j<a.length/2;j++)
    			{
    				if(a[i]>a[j]&&(i!=j))//
    				{ 
    					a[i]=a[i]^a[j];
    					a[j]=a[i]^a[j];
    					a[i]=a[i]^a[j];
    				}	 
    			}	 
    		}
    		for(i=a.length/2;i<a.length;i++)
    		{
    			for(j=a.length/2;j<a.length;j++)
    			{
    				if(a[i]<a[j]&&(i!=j))//
    				{ 
    					a[i]=a[i]^a[j];
    					a[j]=a[i]^a[j];
    					a[i]=a[i]^a[j];
    				}	 
    			}	 
    		}
    		for(i=0;i<a.length;i++)
    		System.out.print(a[i]+" ");
    		System.out.println();
          for(i=a.length-1;i>=0;i--) 
    		{
    			System.out.print(a[i]+ "  ");
    		}
	}

}
