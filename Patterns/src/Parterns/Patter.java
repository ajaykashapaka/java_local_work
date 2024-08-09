package Parterns;

public class Patter 
{
	public static void main(String[] args)
	{
       int i,j;
       for(i=1;i<=5;i++)
       { 
    	   for(j=1;j<=i;j++)
    	   {
    		  if((i==j)||(j==1)||(i==5))
    		   System.out.print(i+" ");
    		  else
    			  System.out.print("  ");
    	   }
    	   System.out.println(" ");
       } 
       for(i=1;i<=5;i++)
       { 
    	   for(j=5;j>=1;j--)
    	   {
    		  if((i==j)||(j==1)||(i==5))
    		   System.out.print(i+" ");
    		  else
    			  System.out.print("  ");
    	   }
    	   System.out.println(" ");
       } 
       for(i=1;i<=5;i++)
       { 
    	   for(j=1;j<=i;j++)
    	   {
    		  if((i==j)||(j==1)||(i==5))
    		   System.out.print(i+" ");
    		  else
    			  System.out.print("  ");
    	   }
    	   System.out.println(" ");
       } 
	}

}
