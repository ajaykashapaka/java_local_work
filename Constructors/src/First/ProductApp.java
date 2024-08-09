package First;
import java.util.Scanner;
public class ProductApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER");
		Product P1=new Product(sc.next(),sc.nextInt());
		P1.display();
		Product p2=new Product(sc.next(),sc.nextInt());
		p2.display();
	}

}
class Product
{
	String Productname;
	int Productroll;
	Product(String name,int roll)
	{
		Productname=name;
		Productroll=roll;
	}
	public void display()
	{
		System.out.println(Productname+" "+Productroll);
	}	
}
