package In;

import java.util.Scanner;

public class Productapp 
{
    String productname;
    int productprice;
    int productquantity;
    long total;
    Productapp(String pn,int pp,int pq)   //parameterized constructor
    {
    	
    }
	public static void main(String[] args) //main method
	{
		System.out.println("well come");
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" enter book details");
		Book b = new Book(sc.next(),sc.nextInt(),
				          sc.nextInt(),sc.next(),sc.nextInt());
		b.cal();
		b.display();
		System.out.println("enter phone details");
		Phone p=new Phone(sc.next(),sc.nextInt(),
		          sc.nextInt(),sc.next(),sc.nextInt());
	    p.cal();
	    p.display();
	}
}
class Book extends Productapp   //child of Productapp
{
	Book(String pn, int pp, int pq,String Ba,int np)
	{
		super(pn, pp, pq);
		productname=pn;
		productprice=pp;
		productquantity=pq;
		Bookauthor=Ba;		
		noofpage=np;
		
	}
	String Bookauthor;
	int noofpage;	
	void cal()
	{
		total=productquantity*productprice;	
	}
	void display ()
	{
		System.out.println(productname+" "+productquantity+" "+productprice+" "+
	                       Bookauthor+" "+noofpage+"total"+total);
	}
}
class Phone extends Productapp  //child of Productapp
{
	Phone(String pn, int pp, int pq,String cn,int Rm) 
	{
		super(pn, pp, pq);  
		productname=pn;
		productprice=pp;
		productquantity=pq;
		companyname=cn;		
		RAM=Rm;

	}
	String companyname;
	int RAM;
	void cal()
	{
		total=productquantity*productprice;
	}
	void display ()
	{
		System.out.println(productname+" "+productquantity+" "+productprice+" "+
	                       companyname+" "+RAM+"Total:"+total);
	}
}
