package Source;

import java.util.Random;
import java.util.Scanner;

public class ARM 
{
public static void main (String args[])
{
System.out.println("well come scanner class");
	 Random nr=new Random();
		//String name=nr.next();//ajju
		int i=nr.nextInt(200);	//153
		System.out.println(i);
		 int var=0,r,temp=0;
		 temp=i;//temp=153
	while (i>0)//153//15//1
	{
		i=i/10;//153/1//0
		var++;//1//2//3
 
	}
	System.out.println("num of digits"+var);//3
	 i=temp;
	double s=0;
	while(i!=0)//153=0//15//1
	{
		r=i%10;//3//5//1
		i=i/10;//15//1//0
		s=s+Math.pow(r,var);//3^3//5^3//1^3
	}
	System.out.println("sum"+ s);//153
	i=temp;
	if(i==s)//153==153
		System.out.println("arm");
	else
		System.out.println("not arm");
}
}
