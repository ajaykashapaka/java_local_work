
public class Product
{
  String productname;
  int productprice;
  Product(String pn,int pp)
  {
	  
  }
	public static void main(String[] args)
	{ 
		book b=new book("classmate",45,"Rs agarwal",430);
		Pen p=new Pen("cell",10,5);
		b.show();
		p.show();
		
	}

}
class book extends Product
{

	String bookauthor;
	int noofpage;
	book( String pn, int pp,String ba,int np)
	{
	 	super(pn,pp);
	 	productname=pn;
	 	productprice=pp;
	 	bookauthor=ba;	
	 	noofpage=np;
	}	
	public void show() 
	{
	System.out.println(productname+" "+productprice+" "+bookauthor+" "+noofpage);
	}
}
class Pen extends Product
{
   int noofpen;
	Pen(String pn, int pp,int np) 
	{
		super(pn, pp);
		productname=pn;
		productprice=pp;
		noofpen=np;

	}
	public void show() 
	{
	System.out.println(productname+" "+productprice+" "+noofpen);
	}
	
}
