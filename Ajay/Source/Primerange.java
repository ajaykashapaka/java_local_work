package Source;
public class Primerange
{
	public static void main(String[] args)
	{
	 int num=1,i,factor=0;
	 for(num=1;num<100;num++)//1<=100t//2<=100t//3<=100//4<=100t
	 {
		 factor=0;
		 for(i=1;i<=num;i++) 
			 
		 {     
             if(num%i==0)//1%1==0t//2%1==0t//3%1==0t//3%2==0f//3%3==0t//4%1=0t
            	 //4%2==0t//4%3f//4%4T
			 factor++;//1//2//0+1=1//1+1=2//0+1=1//1+1=2//2+1=3
		 } 
		 if(factor==2)//1==2f//2==2//2==2//3=2f
	    	 System.out.println(num);//2//3
		 else
			 System.out.println("not aprime"+num);
	 }      
	}
}
