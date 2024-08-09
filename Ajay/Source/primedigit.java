package Source;

public class primedigit
{
   public static void main(String[] args) 
	{
    int i,j,factor=0;
    for(j=2;j<=100;j++)
    {
    	for(i=1;i<=j/2;i++)
    	 factor++;
    }
    if(factor==0)
    	System.out.println(j+"jhkkr");
    }
}
