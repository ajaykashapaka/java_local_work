package Source;

public class Evenoroddd 
{
	public static void main(String[] args) 
	{ 
		int i=342,div,var=0;
		while(i!=0)//342//34//3
		{
			i=i/10;//42//3//0
			var=var+1;//0+1//1+1=2//2+1=3
		}
		System.out.println(var);//3
	}
}
