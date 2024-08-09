package Source;
public class amrdito
{
	public static void main(String[] args)
	{ 
		int input=153,rem,count=0,i,j,fact=0,temp=0;
		temp=input;
		double arm=0;
		while(input!=0)
		{
			input=input/10;
			input=temp;
		while(input>0)
	    {
		 rem=input%10;
		 input=input/10;
		 arm=arm+Math.pow(rem,count);
		}
		input=temp;
		if(input==arm)
			System.out.println("its Amstrong");
		else
		   System.out.println("not a arm");
		}	
		}		   
	}


