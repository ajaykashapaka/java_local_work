package Source;

public class productappelseif
{
	public static void main(String[] args)
	{
		String productname="Milk";
		char productcode='M';
	    int productquantity=2;
	    float productprice=(float)55.76;
	    double discount;
	    int total;
	    total=(int)(productquantity*productprice);
	    System.out.println("total is"+total);	   
	    if(total>=1000 && total<=1200)
	    discount=200;
	    else if(total>=700 && total<=850)
	    discount=150;
	    else if(total>=550 && total<=700)
	    discount=100;
	    else 
	    	discount=0;
	    total=(int)(total-discount);
	    System.out.println(productname+""+productprice+""+productquantity+""+productcode+""+total);
	}

}
