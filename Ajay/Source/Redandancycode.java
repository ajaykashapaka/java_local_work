package Source;

public class Redandancycode 
{

	public static void main(String[] args) 
	{//4*5+6*5=50
		int num=4565,sum1=0,sum2=0,rem,div;
		
		rem=num%10;//5
		div=num/10; //456
		sum1=sum1+rem;//5
	    rem=div%10;//6
	    num=div/10;//45
	    sum1=sum1*rem;//5*6=30
		rem=div%10;//5
		div=div/10;//4  
		sum2=sum2+rem;//0+5
		rem=div%10; //4
		div=div/10; //0
		sum2=sum2*rem;//5*4==20
		sum1=sum2+sum1;//20+6
		System.out.println("4*5+6*5 of given number->"+sum1);
	}
}
