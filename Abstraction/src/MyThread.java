
public class MyThread extends Thread
{
	
   public void run()
   {
	   for( int i=0;i<=10;i++)
	   System.out.println("My Child");
   }
	public static void main(String[] args)
	{ 
         MyThread T=new MyThread();
         T.start();
         for(int i=0;i<=10;i++)
         {
        	 System.out.println("Main thread");
         }
	}

}
