package Second;

import java.util.Scanner;   //  
public class Demo_con 
{
	public static void main(String[] args) 
	{   
		System.out.println("well come");
		Demo D=new Demo();
		D.diplay(); 
	}
}
class Demo
{
	String name;
	int roll; 
	Scanner sc=new Scanner(System.in);
	Demo()
	{
	  name=sc.next();
	  roll=sc.nextInt();		  
	}
	public void diplay()
	{ 
			System.out.println(name+" "+roll);
	}
}