package Poly_Prgs;

public class Over_riding    //this my parent class 
{
     int a;
     int b;
     public void add()    //
     {   
    	a=10;
    	b=20;
    	 System.out.println(a+b);
     }
     public void sub(int a,int b)
     {
    	 a=20;
    	 b=40;
    	 System.out.println(a-b);
     }
	public static void main(String[] args) 
	{
	 
      Child c=new Child();
      c.add();
      c.sub(500,1000);
    		  
	}
}
class Child extends Over_riding
{
	  public void add()    //
	     {
	    	a=400;
	    	b=200;
	    	 System.out.println((a+b)+" Updated");
	     }
	     public void sub(int a,int b)
	     {
	    	 
	    	 System.out.println((a-b)+"- Updated value");
	     }	
}
