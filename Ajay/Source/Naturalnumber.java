package Source;

public class Naturalnumber
{

	public static void main(String[] args) 
	{
		int input=104;
		int mod,div,sum=0;
		mod=input%10;//4
		div=input/10;//10
		sum=sum+mod;//4
		mod=div%10;//0
		div=div/10;//1
		sum=sum+mod;//4
		mod=div%10;//1
		div=div/10;//0
		sum=sum+mod;//5
		 System.out.print(div+"/n"+mod+""+sum);
		
		

	}

}
