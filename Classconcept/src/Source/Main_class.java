package Source;
public class Main_class 
{
	public static void main(String[] args) 
	{ 
	 ProductApp oil=new ProductApp();
	 ProductApp milk=new ProductApp();
	 System.out.println("well to product app");
	 oil.oilintialize();
	 oil.oilcal(oil.Pprice,oil.quantity);
	 oil.oildisplay();
	 milk.milkintialize();
	 milk.milkcal(milk.Pprice,milk.quantity);
	 milk.milkdisplay();
	 System.out.println("Happy shopping "+" visit again");
	}
}
class ProductApp
{
	String Pname;
	char Pcode;
	float Pprice;
	int discount;
	double quantity;
	int total;
	public void oilintialize()
	{
	 Pcode='O';
	 Pname="Oil";
	 Pprice=100;
	 quantity=4;
	}
	public int oilcal(float Pprice,double quantity)
	{
		total=(int)(Pprice*quantity);
		if(total==1000)
			discount=100;
		else if(total==1500)
			discount=150;
		else if(total==200)
			discount=200;
		else
			discount=0;
		System.out.println(discount);
		total=total-discount;
		System.out.println(total);
		return total;
	}
	public void oildisplay()
	{
		System.out.println(Pname+" "+Pcode+" "+Pprice+" "+quantity);
	}
	public void milkintialize()
	{
	  Pname="milk";
	  Pcode='m';
	  Pprice=50;
	  quantity=10;	
	}
	public int milkcal(float Pprice,double quantity)
	{
		total=(int) (Pprice*quantity);
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
		System.out.println(total);
		return total;
	}
	void milkdisplay()
	{
		System.out.println(Pname+" "+Pcode+" "+Pprice);
	}
}
