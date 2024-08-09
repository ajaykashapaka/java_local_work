package Src;

public class Driver_fun {

	public static void main(String[] args) 
	{
     int a[]=new int[] {15,17,19,28,83};
     int l,h,m,i,j;
     l=0;h=a.length-1;
     m=(l+h)/2;
     int search=28;
     while(l<=h)
     {
    	 if(a[m]<search)//
    		 l=m+1;
    	 else if(a[m]==search)
    	 {
    		 System.out.println("element found"+(m+1));
    	      break;
    	 }
    	 else if(a[m]>search) 
    		 h=m-1;
    	 m=(l+h)/2;		 
     }
  
	}

}
