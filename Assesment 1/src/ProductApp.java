import java.util.Scanner;

public class ProductApp
{
	String Productname;
    char Productcode;
	float Productprice;
	double Productquantity;
	int producttotal;
	int discount;
	boolean bill;
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter here");
		ProductApp milk=new ProductApp();
		milk.Productname=sc.next();
        milk.Productcode=sc.next().charAt(0);
        milk.Productprice=sc.nextFloat();
        milk.Productquantity=sc.nextDouble();
        int a=milk.calculate(milk.Productprice,milk.Productquantity);
        
        milk.display();
        ProductApp oil=new ProductApp();
        oil.Productname=sc.next();
        oil.Productcode=sc.next().charAt(0);
        oil.Productprice=sc.nextFloat();
        oil.Productquantity=sc.nextDouble();
        int b=oil.calculate(oil.Productprice,oil.Productquantity);
        oil.display();
        
    System.out.println();

	}
	public int calculate(float Productprice,double Productquantity)
	{
		producttotal=(int) (Productprice*Productquantity);
		if(producttotal==1000)
			discount=100;
		else if(producttotal==1500)
			discount=150;
		else if(producttotal==2000)
			discount=200;
		else
			discount=0;
		System.out.println("discount is"+discount);
		producttotal=producttotal-discount;
		System.out.println("product total:"+producttotal);
		return producttotal;	
	}
	public void display()
	{
		System.out.println(Productname+" "+Productcode+" "+Productprice+" "+Productquantity);
	} 
}


