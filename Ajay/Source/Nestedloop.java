package Source;

public class Nestedloop 
{
	public static void main(String[] args) 
	{ 
     double result=0;
     int count=0,a,copy=0,rem=0,i;
     for(a=1;a<=1000;a++)//1<=1000
     {
    	 a=copy;
    	 while(a>0)
    	 {
    		 rem=a/10;
    		 count++;
    		 
    	 }copy=a;
    	 while(a>0)
    	 { 
    		 rem=a%10;
    		 a=a/10;
    		 result=result+Math.pow(rem,count);
    		 
    	 }
    	 a=copy;
    	 if(a==result)
    	 {
    		 int temp=0;
    		 for(i=1;i<=a;i++)
    		 {
    		
    		 }
    		 
    	 }
     }
    	 
	}

}
