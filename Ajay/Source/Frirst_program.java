package Source;

public class Frirst_program
{
	public static void main(String[] args) 
	{  
		String Productname="oil";
		char productcode='o';
		float Productprice=132f;
		double productquantity=1.5;
		int total;
		//logic
		total=(int)(productquantity*Productprice);//Explicity
		System.out.println("Productname:"+Productname+"\n"+"productcode:"+productcode+"\n"+"price:"+"\n"
		+Productprice+"\n"+"Product quantity:"+productquantity+"\n"+"total:"+"\n"+total);	
	}
}
