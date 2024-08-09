package First;

public class Productappp
{
	 String productname;       //instancevariable
	 float productcode;
	 int    productprice;
	 int productquantity;
	 public static void main (String args[])
		  {
		   Book b=new Book();
		   b.productname="book";
		   b.productcode='c'; 
		   b.productprice=400;
		   b.productquantity=3;  
		   b.bookauthor="RSagarwal";
	       b.noofpage=45;
		  }
 }
	
	class Book extends Productappp  //child class
     {
	 String bookauthor;
	 int noofpage;
	 }
