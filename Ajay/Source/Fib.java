package Source;
public class Fib
{
	public static void main(String[] args)
	{ 
		 // fibocci series
		/*int first=0,second=1,third;
		 -->fibobic series
		 
		for(int i=0;i<=10;i++)  //
		{
			third=first+second; //0+1=1
			System.out.print(third+" ");
			first=second; // 
			second=third; // s=1
			 
		} */
		
		/*int num=7;
		int count =0;
		for(int i=1;i<=num;i++)  //1
		{
			if(num%i==0) //7%1==0;  
			{
				count++;
				System.out.println(count);
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
			System.out.println("not prime"); */
		
		// prime range
		
		/*int i ,j,count;
		 for(i=1;i<=100;i++)  //1-100
		 {
			 count=0;
			 for(j=1;j<=i;j++)  //1-i
			 {
				 if(i%j==0)
				 {
					 count++;
					 
				 }
			 }
			 if(count==2)
			 {
				 System.out.print("Prime"+i);
			 }
		 }*/
		
	/*	 
		int num=10,factor=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				;
				System.out.print(" "+i);
			}
		}
		*/
		
	/*  factrorial	
	 * 
	
		int fact=1;
		int num=5;
		
		for(int i=1;i<=num;i++)  // 1
		{
			  fact=fact*i;  //1*1=1*2=2*3=6*4=24*5= 120
		}
		System.out.println(fact); 
		
 */

	/*	 Amstrong numbers
	 * 
	  int num=153,sum=0;
	  int temp=num;
	  int rem,arm;
	  while(num>0)
	  {
		  rem=num%10;
		  num=num/10;
	      sum=sum+rem*rem*rem;		
	  }
	  System.out.println(sum);
	  if(sum==temp)
	  {
		  System.out.println("Amstrong");
	  }
	  else
		  System.out.println("not arm");  
		  
		  */
	  
	  /*  amstrong
	   * 
		int num,rem;double arm;
		
		for(num=1;num<=1000;num++)
		{
			int temp=num;
			arm=0;
			int count=0;
			 while(num>0)
			 {
				num=num/10;
				count++;
			 }
			 num=temp;
			 
			 while(num>0)
			 {
				 rem=num%10;
				 num=num/10;
				 arm=arm+Math.pow(rem,count);	 
			 }
			 num=temp;
			 
			 if(num==arm)
			 {
				 System.out.println(num);
			 }
		}
		
		*/
		
	/* polindrom
	 * 	
		int num,rem;
		int rev;
		for( num=1;num<100;num++)   //1<=100
		{
		  rev=0;
			int temp=num; //1	
		   while(num!=0)//11;1
			{
				rem=num%10;//1 //1
				num=num/10;//1//0
				rev=rev*10+rem;  //0+1*10+1=11;
			}   
		   num=temp; 
		   if(rev==num) // 11==11
				System.out.println(rev);	   
		}	 
		
		*/	
	}
}


