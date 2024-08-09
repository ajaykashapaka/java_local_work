package Source;

public class Conversions//using case sensitivity
{

	public static void main(String[] args) 
	{
		  byte b;//1byte
		  int i=150;//4byte
		  double d=98.8;//8byte
		  b=(byte)(i);
          System.out.println("convesion of int to byte:"+b);
          i=(int)(d);
          System.out.println("conversion of duoble to int:"+i);
          b=(byte)(d);
          System.out.println("convertion of double to byte:"+d);
	}

}
