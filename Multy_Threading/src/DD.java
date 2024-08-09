
public class DD extends Thread
{
   public void  run()
   {
	   for(int i=0;i<=9;i++)
	   {
		   System.out.println("pp");
	   }
	   
   }
	public static void main(String[] args) 
	{
      DD d=new DD();
      d.start();
      
      for(int i=0;i<=4;i++)
      {
    	System.out.println();  
    	  System.out.println("ss");
      }
	}

}
