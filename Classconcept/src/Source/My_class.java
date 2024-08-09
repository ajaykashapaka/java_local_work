package Source; 
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class My_class 
{
	public static void main(String[] args)
	{
	 Scanner ar=new Scanner(System.in);//create a object
	 System.out.println("well come");//some massege
	 //for paragraph
		 String Myname=ar.nextLine();
		 //big integer
		 BigInteger Mynum=ar.nextBigInteger();
		 //big decimal values
		 BigDecimal value=ar.nextBigDecimal();
          System.out.println("My name is"+ Myname +" my number is "+ Mynum +"my decimal value is"+ value);
	}
}
