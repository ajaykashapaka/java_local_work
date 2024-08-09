package Source;
public class Test 
{
	public static void main(String[] args) 
	{
		int input=11,x,var=0;//
		for (x=1;x<=input;x=x+1)//x=1,2,3,4,5
		{
			if (input%x==0)//11%1==0//......11%11==0
			{
				var=var+1;//0+1=1//1+1=2
			} 
		}
       if(var==2)
       { 
    	   System.out.println("prime");
    	  
       }
       else
    	   System.out.println("not prime");
	}
}
