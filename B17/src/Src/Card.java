package Src;
public class Card {
 public static void main(String[] args) {
 int [] a=new int[] {3,4,2,0,1};
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a.length;j++)
    	 {
    	 if(a[i]<a[j])
    		{
    			 a[i]=a[i]^a[j];
    			 a[j]=a[i]^a[j];
    			 a[i]=a[i]^a[j];
    			 
    		}
    	 }
    	 for(i=0;i<a.length;i++)
    	 {
    		 System.out.println(a[i]);
    	 }
     }
	}
}
