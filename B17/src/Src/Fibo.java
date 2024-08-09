package Src;

public class Fibo 
{
	public static void main(String[] args) 
	{
	int sum=0,count=0;
  int num=7;
  int i,j;
  int fact=0;
  for(i=1;i<=1000;i++)
  {
	 fact=0;
     for(j=1;j<=i;j++)
      {
	  if(i%j==0)
	  {
		  fact++;
		 
	  }
	  }
     if(fact==2)
     {
    	 sum=sum+i;
    	 count++;
   	  System.out.println(i+" ");
     }

     }System.out.println(count+" count"+" "+"sum:"+sum);
  }
}
