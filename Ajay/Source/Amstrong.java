package Source;
public class Amstrong 
{
	public static void main(String[] args) 
	{ //intialization
		int k,num,rem,sum,var=0;
		double arm=0;
		//range condtion
		for(k=1;k<=1000;k++)//1<=1000 true//
		{  //calculation
			arm=0;
			int x;
			x=k;var=0;
			while(k!=0)//1!=0ytrue 
			{
				k=k/10;//0
				var=var+1;//0+1=1
			}
			k=x;//while loop
			while(k!=0)
			{
				rem=k%10;//1
				k=k/10;//0
		     arm=arm+Math.pow(rem,var);//0+1=1^1
			}//k=0
			k=x;//if statement given num is arm or not
			if(k==arm)//0
			{
				System.out.println(k);//0
			}		
		}
	}
}
