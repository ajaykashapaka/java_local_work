package Source;
import java.util.Scanner;
public class Prime 
{
	public static void main(String[] args) 
	{ 
		System.out.println("well to ProductApp");
		ProductApp1 oil=new ProductApp1();
		ProductApp1 milk=new ProductApp1();
		oil.oilintialize();
		milk.milkintialize();
		oil.display();
		milk.display();
		oil.calculate( 5,200);
	}
}
class  ProductApp1
{
	 String Productname;
	 char Productcode;
	 float Productprice;
	 int total;
	 double quantity;
	 int discount;
	 
 public void oilintialize( )
 {
      Productname="Oil";
	  Productcode='O';
	  Productprice=200;
	  quantity=5;
	 
 }
 public int calculate(float Productprice ,double quantity)
 {
	 total=(int)(Productprice*quantity);
	 if(total==1000)
	 discount=100;
	 else if(total==1500)
		 discount=150;
	 else if(total==2000)
		 discount=200;
	 else
		 discount=0;
	 System.out.println(discount);
	 total=total-discount;
	 return total; 
 }
 public void milkintialize()
 {
	 Productname="milk";
	 Productprice=100;
	 Productcode='M';
	 quantity=15;
 }
 public void display()
 {
	 System.out.println(Productname+" "+Productprice+" "+Productcode+" "+quantity);
 }
}
