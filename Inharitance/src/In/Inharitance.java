package In;

import java.util.Scanner;

public class Inharitance 
{
	public static void main(String[] args) 
	{
		System.out.println("well come");
		Milk m= new Milk();
		Scanner sc=new Scanner(System.in);
		m.productname=sc.next();
		m.productquantity=sc.nextInt();
		m.productprice=sc.nextFloat();
		m.productsize=sc.nextInt();
		m.cal();
		m.show();

	}
 
}
class Demo  // parent class
{

	String productname;   // instance variable
	int productquantity;
	float productprice;
	double producttotal;
	public void cal()
	{
		producttotal=productprice*productquantity;
	}
	
}
class Milk extends Demo  // child class
{
	char productcode;
	int productsize;
	
	public void show()
	{
		System.out.println(productname+" "+productquantity+" "+productprice
				+" "+producttotal+" "+productcode+" "+productsize);
	}
}

