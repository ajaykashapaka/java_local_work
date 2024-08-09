package Note;

public class Over_Riding {

	public static void main(String[] args) 
	{
       Child c=new Child();
       c.colour();
       c.cal();
       c.dis();
       
	}
}
class Parent
{
	String Housename;
	int noofroom;
	Parent()
	{
		Housename="2BHK";
		noofroom=6;
	}
	public void colour()
	{
		System.out.println("white");
	}
	
}
class Child extends Parent
{
    int for1room;
    long totalrent;
    Child()
    {
    	super();
    	for1room=5000;
    	
    }
    public void colour()
   {
   System.out.println("white blue purple"); 	
   }
     public long cal()
       {
    	totalrent=noofroom*for1room;
    	return totalrent;
      }
     public void dis()
     {
    	 System.out.println(Housename+" "+noofroom+" "+for1room+" "+totalrent);
     }
}
